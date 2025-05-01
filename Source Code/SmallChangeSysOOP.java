package com.SmallChange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能的类
 * 使用OOP（面向对象编程）
 * 将各个功能对应一个方法
 */
public class SmallChangeSysOOP {
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


    //先完成显示菜单，并可以选择
    public void mainMenu() {
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
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        } while (loop);
    }

    //完成零钱通明细
    public void detail() {
        System.out.println(detsils);
    }

    //完成收益入账
    public void income() {
        System.out.println("收益入账金额");
        money = scanner.nextDouble();
        //money的值范围应该校验
        if (money <= 0) {
            System.out.println("收益金额需要大于0");
            return;//退出方法，不再执行后面的代码
        }
        balance += money;
        date = new Date();//获取当前日期
        //拼接收益入账信息到 details
        detsils += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //完成消费
    public void pay() {
        System.out.println("消费金额");
        money = scanner.nextDouble();
        //money的值范围应该校验
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应该在0-" + balance);
            return;
        }
        System.out.println("消费说明");
        note = scanner.next();
        balance -= money;
        date = new Date();//获取当前日期
        //拼接消费信息到 details
        detsils += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //退出
    public void exit() {
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
    }
}
