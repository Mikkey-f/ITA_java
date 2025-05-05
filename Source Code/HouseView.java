package com.houserent.view;

import com.houserent.domain.House;
import com.houserent.service.HouseService;

import java.util.Objects;
import java.util.Scanner;

public class HouseView {
    public boolean loop = true;
    private int key;//接收用户选择
    Scanner scanner = new Scanner(System.in);
    private HouseService houseService = new HouseService(3);

    //根据id修改房屋信息
    public void update(){
        System.out.println("=================修改房屋信息=================");
        System.out.println("请输入待修改的房间编号（-1表示退出）");
        int updateId=scanner.nextInt();
        if (updateId==-1){
            System.out.println("============放弃修改房屋信息===========");
            return;
        }
        House house=houseService.findById(updateId);
        if (house==null){
            System.out.println("输入的房屋信息编号不存在。。。");
            return;
        }
        System.out.println("修改名字"+house.getNAME()+":");
        String name=scanner.next();
        if(name!=null){
            house.setNAME(name);
        }
        System.out.println("修改电话"+house.getPhone()+":");
        String phone=scanner.next();
        if(phone!=null){
            house.setNAME(phone);
        }
    }




    //编写delHouse()接收输入的id，调用Service的del方法
    public void delHouse() {
        System.out.println("============删除房屋信息============");
        System.out.println("请输入要删除的房屋的编号（-1退出）：");
        int delid = scanner.nextInt();
        if (delid == -1) {
            System.out.println("============放弃删除房屋信息===========");
            return;
        }
        System.out.println("请确认是否删除(Y/N)");
        String s = scanner.nextLine();
        char c = 0;
        if (s.length() > 0) {
            c = s.charAt(0);
        }
        if (c == 'Y') {
            houseService.del(delid);
            System.out.println("=================删除房屋信息成功====================");
        } else {
            System.out.println("============房屋编号不存在，删除失败===========");
        }
        if (c == 'N') {
            System.out.println("============放弃删除房屋信息===========");
        }
    }

    //根据id查找房屋信息
    public void findHouse() {
        System.out.println("==============查找房屋信息===============");
        System.out.println("请输入要查找的id：");
        int findId = scanner.nextInt();
        House house = houseService.findById(findId);
        if (house!=null){
            System.out.println(house);
        }else {
            System.out.println("==============查找房屋信息不存在===============");
        }
    }


    //编写addHouse方法，创建House对象，调用add方法
    public void addhouse() {
        System.out.println("============添加房屋============");
        System.out.println("姓名：");
        String name = scanner.next();
        System.out.println("电话：");
        String phone = scanner.next();
        System.out.println("地址：");
        String address = scanner.next();
        System.out.println("月租：");
        int rent = scanner.nextInt();
        System.out.println("状态：");
        String state = scanner.next();
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("=========添加房屋成功===========");
        } else {
            System.out.println("=========添加房屋失败===========");
        }
    }

    //编写listHouses（）显示房屋列表
    public void listHouses() {
        System.out.println("=========房屋列表============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租");
        House[] houses = houseService.list();//得到所有房屋的信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }//为空就不输出
            System.out.println(houses[i]);
        }
        System.out.println("=========房屋列表显示完毕============");
    }

    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("===========房屋出租系统菜单=============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 显 示 房 屋 信 息");
            System.out.println("\t\t\t6 退出");
            System.out.println("请输入你的选择（1-6）");
            key = scanner.nextInt();
            switch (key) {
                case 1:
                    addhouse();
                    break;
                case 2:
                    findHouse();
                    break;
                case 3:
                    delHouse();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    listHouses();
                    break;
                case 6:
                    System.out.println("退出");
                    loop = false;
                    break;
            }
        } while (loop);
    }
}
