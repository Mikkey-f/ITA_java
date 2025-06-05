package com.szj.qqclient.service;

import com.szj.qqcommon.Message;
import com.szj.qqcommon.MessageType;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;

/**
 * @author 司志俊
 * @version 1.0
 * 完成文件的传输服务
 */
public class FileClientService {
    public void sendFileToOne(String src, String dest, String sender, String getter) throws Exception{
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_FILE_MES);
        message.setSender(sender);
        message.setGetter(getter);
        message.setSrc(src);
        message.setDest(dest);
        //读取文件
        FileInputStream fileInputStream = null;
        byte[] fileBytes = new byte[(int)new File(src).length()];
        fileInputStream = new FileInputStream(src);
        fileInputStream.read(fileBytes);//将src文件读入到程序的字节数组
        //写入message
        message.setFileBytes(fileBytes);
        if (fileInputStream != null){
            fileInputStream.close();
        }

        System.out.println("\n" + sender + "给 " +getter + "发送文件" + src
        + "到对方的电脑的目录 " + dest);
        //发送
        ObjectOutputStream oos =
                new ObjectOutputStream(MessageClientConnectServerThread.getClientConnectServerThread(sender).getSocket().getOutputStream());
        oos.writeObject(message);
    }
}
