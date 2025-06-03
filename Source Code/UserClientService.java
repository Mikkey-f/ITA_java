package com.szj.qqclient.service;

import com.szj.qqcommon.Message;
import com.szj.qqcommon.MessageType;
import com.szj.qqcommon.User;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 司志俊
 * @version 1.0
 * 该类完成用户登录验证和用户注册等功能
 **/
public class UserClientService {
    private User user = new User();//因为我们可能在其他地方使用User信息
    private Socket socket;//可能在其他地方使用

    public boolean checkUser(String userId,String pdw) throws Exception {
        boolean b = false;

        //创建User对象
        user.setUserId(userId);
        user.setPasswd(pdw);

        //连接到服务器，发送user对象

        socket = new Socket(InetAddress.getLocalHost(), 9999);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        objectOutputStream.writeObject(user);//发送User对象

        //读取从服务端回复的Message对象
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        Message ms = (Message) objectInputStream.readObject();

        if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)){//登录成功


            //创建一个和服务器保持通信的线程-> 创建一个类 ClientConnectServerThread
            //等待。。。
            ClientConnectServerThread ccst = new ClientConnectServerThread(socket);
            //启动客户端的线程
            ccst.start();
            //为了客户端的扩展，我们将线程放入集合管理
            MessageClientConnectServerThread.addClientConnectServerThread(userId,ccst);

            b = true;
        } else {//登录失败
            //如果登录失败，我们不能启动和服务器通信的线程，关闭socket
            socket.close();
        }
        return b;
    }

    //向服务端请求显示在线用户列表
    public void onlineFriendList() throws Exception{
        //发送Message,类型 MESSAGE_GET_ONLINE_FRIEND
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(user.getUserId());

        //发送给服务器
        //应该得到当前线程的Socket 对应的 ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream
                (MessageClientConnectServerThread.getClientConnectServerThread(user.getUserId()).getSocket().getOutputStream());
        oos.writeObject(message);//向服务器要求在线用户列表
    }

    //编写方法退出客户端，并给服务器发送一个退出系统的message对象
    public void logout() throws Exception{
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(user.getUserId());

        //发送message
        //ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        //等价于
        ObjectOutputStream oos =
                new ObjectOutputStream(MessageClientConnectServerThread.getClientConnectServerThread(user.getUserId()).getSocket().getOutputStream());
        oos.writeObject(message);
        System.out.println(user.getUserId() + " 退出系统");
        System.exit(0);//结束进程
    }
}
