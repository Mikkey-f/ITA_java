package com.szj.qqclient.service;

import com.szj.qqcommon.Message;
import com.szj.qqcommon.MessageType;

import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author 司志俊
 * @version 1.0
 * 该类提供和消息相关的方法
 */
public class MessageClientService {

    public void sendMessageToAll(String content, String senderId) throws Exception{//群发
        Message message = new Message();
        message.setSender(senderId);
        message.setContent(content);
        message.setMesType(MessageType.MESSAGE_TO_ALL_MES);//群发消息
        message.setSendTime(new Date().toString());//发送时间
        System.out.println(senderId + "对大家说" + content);

        //发送给服务端
        ObjectOutputStream oos =
                new ObjectOutputStream(MessageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
        oos.writeObject(message);

    }


    public void sendMessageToOne(String content,String senderId,String getterId) throws Exception{//私聊
        Message message = new Message();
        message.setSender(senderId);
        message.setGetter(getterId);
        message.setContent(content);
        message.setMesType(MessageType.MESSAGE_COMM_MES);//普通消息
        message.setSendTime(new Date().toString());//发送时间
        System.out.println(senderId + "对" + getterId + "说" + content);
        //发送给服务端
        ObjectOutputStream oos =
                new ObjectOutputStream(MessageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
        oos.writeObject(message);
    }
}
