package com.szj.qqserver;

import com.szj.qqcommon.Message;
import com.szj.utility.Utility;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author 司志俊
 * @version 1.0
 */
public class SendNewsToAllService implements Runnable{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {//多次推送用while
        while (true) {
            System.out.println("请输入服务器要推送的新闻[输入exit表示退出推送服务]");
            String news = Utility.readString(100);
            if ("exit".equals(news)){
                break;
            }
            Message message = new Message();
            message.setSender("服务器");
            message.setContent(news);
            message.setSendTime(new Date().toString());

            //遍历线程
            HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();
            Iterator<String> iterator = hm.keySet().iterator();
            while (iterator.hasNext()) {
                String onlineUserId = iterator.next();//iterator.next()返回的是String类型的对象
                ServerConnectClientThread serverConnectClientThread = hm.get(onlineUserId);
                try {
                    ObjectOutputStream objectOutputStream =
                            new ObjectOutputStream(serverConnectClientThread.getSocket().getOutputStream());
                    objectOutputStream.writeObject(message);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
