package com.szj.qqserver;

import com.szj.qqcommon.Message;
import com.szj.qqcommon.MessageType;
import com.szj.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 司志俊
 * @version 1.0
 * 这是服务端，在监听9999，等待客户的连接，并保持通信
 */
public class QQServer {

    private ServerSocket ss = null;

    //创建一个集合，存放多个用户，如果是这些用户登录，就认为是合法的
    //这里可以使用 ConcurrentHashMap，可以处理并发的集合，没有线程安全问题
    //HashMap 没有处理线程安全，因此在多线程情况下不安全
    private static ConcurrentHashMap<String, User> validUser = new ConcurrentHashMap<>();

    static {//在静态代码初始化 validUsers
        validUser.put("100", new User("100", "123456"));
        validUser.put("200", new User("200", "123456"));
        validUser.put("300", new User("300", "888888"));
        validUser.put("司志俊", new User("司志俊", "123456"));

    }

    //验证用户是否有效的方法
    public boolean checkUser(String userId, String passwd) {

        User user = validUser.get(userId);
        if (user == null) {//说明userId没有存在validUsers 的key中
            return false;
        }
        if (!user.getPasswd().equals(passwd)) {//密码错误
            return false;
        }
        return true;
    }

    public QQServer() {
        System.out.println("服务器在9999端口监听。。。");

        try {
            //启动推送新闻的线程
            new Thread(new SendNewsToAllService()).start();
            ss = new ServerSocket(9999);
            while (true) {//当和某个客户端建立联系后，会继续监听
                Socket socket = ss.accept();//没有客户端连接就会阻塞在这里
                ObjectInputStream ois =
                        new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream oos =
                        new ObjectOutputStream(socket.getOutputStream());
                User user = (User) ois.readObject();
                Message message = new Message();
                //验证用户
                if (checkUser(user.getUserId(), user.getPasswd())) {//登录通过

                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);

                    oos.writeObject(message);
                    //创建一个线程和客户端保持通信，该线程需要持有socket对象
                    ServerConnectClientThread serverConnectClientThread =
                            new ServerConnectClientThread(socket, user.getUserId());
                    serverConnectClientThread.start();
                    //把该线程对象放入到一个集合中，进行管理
                    ManageClientThreads.addClientThread(user.getUserId(), serverConnectClientThread);

                } else {//登录失败
                    System.out.println("用户 id=" + user.getUserId() + "pwd= " + user.getPasswd() + " 验证失败");
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    socket.close();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                //如果服务器退出了while,说明服务器不再监听，因此关闭ServerSocket
                ss.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
