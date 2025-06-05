package com.szj.qqclient.service;

import com.szj.qqcommon.Message;
import com.szj.qqcommon.MessageType;

import java.io.*;
import java.net.Socket;

/**
 * @author 司志俊
 * @version 1.0
 */
public class ClientConnectServerThread extends Thread{
    //该线程需要持有Socket
    private Socket socket;

    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    //为了方便的得到socket
    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() {
        //因为Thread需要在后台和服务器通信，因此用while循环
        while (true) {

            try {
                System.out.println("客户端线程等待从服务器发送的消息");
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                Message message= (Message) objectInputStream.readObject();
                //如果服务器没有发送Message对象，线程会阻塞在这里
                //判断message的类型
                if (message.getMesType().equals(MessageType.MESSAGE_RET_ONLINE_FRIEND)){
                    //取出在线列表信息并显示
                    String[] onlineUsers = message.getContent().split(" ");//依据指定的分隔符把字符串分割成若干子字符串，最终返回一个字符串数组
                    System.out.println("\n=============当前在线用户列表===============");
                    for (int i =0;i<onlineUsers.length; i++){
                        System.out.println("用户：" + onlineUsers[i]);
                    }

                } else if (message.getMesType().equals(MessageType.MESSAGE_COMM_MES)) {//普通聊天消息
                    //把从服务器转发的消息显示到控制台
                    System.out.println("\n" + message.getSender() + "说：" + message.getContent());
                    
                } else if (message.getMesType().equals(MessageType.MESSAGE_TO_ALL_MES)) {
                    //显示
                    System.out.println("\n" + message.getSender() + "对大家说：" + message.getContent());

                } else if (message.getMesType().equals(MessageType.MESSAGE_FILE_MES)) {//如果是文件消息
                    System.out.println("\n" + message.getSender() + "给" + message.getGetter()
                    + " 发送文件" + message.getSrc() + "我的电脑的目录 " + message.getDest());
                    //将文件写入磁盘
                    FileOutputStream fileOutputStream = new FileOutputStream(message.getDest());
                    fileOutputStream.write(message.getFileBytes());
                    fileOutputStream.close();
                    System.out.println("接收文件成功");

                } else {
                    System.out.println("暂时不处理");
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
}
