package com.szj.qqclient.view;

import com.szj.qqclient.service.MessageClientConnectServerThread;
import com.szj.qqclient.service.UserClientService;
import com.szj.qqclient.utils.Utility;

/**
 * @author 司志俊
 * @version 1.0
 * 菜单界面
 */
public class QQView {

    private boolean loop = true;//控制是否显示菜单
    private String key = "";//接收用户输入
    private UserClientService userClientService = new UserClientService();//对象是用于登录服务/注册用户

    public static void main(String[] args) throws Exception{
        new QQView().mainMenu();
        System.out.println("客户端退出系统");
    }



    private void mainMenu() throws Exception {
        while (loop){

            System.out.println("============欢迎登录网络通信系统==================");
            System.out.println("\t\t 1 登录系统");
            System.out.println("\t\t 9 退出系统");
            System.out.println("请输入你的选择：");
            key = Utility.readString(1);

            //根据用户的输入来处理不同的逻辑
            switch (key){
                case "1":
                    System.out.println("请输入用户号");
                    String userId = Utility.readString(50);
                    System.out.println("请输入密 码：");
                    String pwd = Utility.readString(50);
                    //需要到服务端验证该用户是否合法
                    if (userClientService.checkUser(userId,pwd)){
                        System.out.println("================欢迎(用户 " + userId + " 登录成功)================");
                        //进入二级菜单
                        while (loop){
                            System.out.println("\n================网络通信系统二级菜单(用户 " + userId + " )===============");
                            System.out.println("\t\t 1 显示在线用户列表");
                            System.out.println("\t\t 2 群发消息");
                            System.out.println("\t\t 3 私聊消息");
                            System.out.println("\t\t 4 发送文件");
                            System.out.println("\t\t 9 退出系统");
                            System.out.println("请输入你的选择");
                            key = Utility.readString(1);
                            switch (key){
                                case "1":
                                    userClientService.onlineFriendList();
                                    break;
                                case "2":
                                    System.out.println("群发消息");
                                    break;
                                case "3":
                                    System.out.println("私聊消息");
                                    break;
                                case "4":
                                    System.out.println("发送文件");
                                    break;
                                case "9":
                                    loop = false;
                                    break;
                            }

                        }
                    }else {//登录服务器失败
                        System.out.println("===========登录失败===========");
                    }
                    break;
                case "9":
                    //调用方法，给服务器发送一个退出系统的message
                    userClientService.logout();
                    loop = false;
                    break;
            }
        }
    }
}
