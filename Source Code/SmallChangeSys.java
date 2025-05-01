package com.SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SplittableRandom;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //2.完成零钱通明细
        String detsils = "------------零钱通明细---------------";

        //3.完成收益入账
        double money = 0;
        double balance = 0;
        Date date = null;//date 表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化

        //4.消费
        String note = "";
        do {
            System.out.println("\n================零钱通菜单==================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入帐");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退   出");

            System.out.println("请选择（1-4）");
            key = scanner.next();
            //使用switch 分支控制
            switch (key) {
                case "1":
                    System.out.println(detsils);
                    break;
                case "2":
                    System.out.println("收益入账金额");
                    money = scanner.nextDouble();
                    //money的值范围应该校验
                    if (money<=0){
                        System.out.println("收益金额需要大于0");
                        break;
                    }
                    balance += money;
                    date = new Date();//获取当前日期
                    //拼接收益入账信息到 details
                    detsils += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费金额");
                    money = scanner.nextDouble();
                    //money的值范围应该校验
                    if (money<=0||money>balance){
                        System.out.println("消费金额应该在0-"+balance);
                        break;
                    }
                    System.out.println("消费说明");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();//获取当前日期
                    //拼接消费信息到 details
                    detsils += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    String choice = "";
                    //接收输入
                    while (true) {
                        System.out.println("你确定要退出吗？ y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }//保证输入必须为y或n

                    if ("y".equals(choice)) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        } while (loop);
        System.out.println("----------退出零钱通项目------------");
    }
}
