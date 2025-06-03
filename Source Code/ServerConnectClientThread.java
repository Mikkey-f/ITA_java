package com.szj.qqserver;

import com.szj.qqcommon.Message;
import com.szj.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @author 司志俊
 * @version 1.0
 * 该类的一个对象和某个客户端保持通信
 */
public class ServerConnectClientThread extends Thread{

    private Socket socket;
    private String userId;//连接到服务端的用户id

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    @Override
    public void run() {//这里线程处于run的状态，可以发送/接收消息

        while (true){

            try {
                System.out.println("服务端和客户端" + userId + "保持通信，读取数据。。。。");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                //根据messgae类型进行相应的业务处理
                if (message.getMesType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)){
                    System.out.println(message.getSender() + " 要在线用户列表");
                    String onlineUser = ManageClientThreads.getOnlineUser();
                    //返回
                    Message message2 = new Message();
                    message2.setMesType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                    message2.setContent(onlineUser);
                    message2.setGetter(message.getGetter());
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message2);

                } else if (message.getMesType().equals(MessageType.MESSAGE_CLIENT_EXIT)){//客户端退出

                    System.out.println(message.getSender() + " 退出");
                    //将这个客户端对应的线程从集合中删除
                    ManageClientThreads.removeServerConnectClientThread(message.getSender());
                    socket.close();
                    //退出线程
                    break;
                }
                else {
                    System.out.println("暂时不处理");
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
}
