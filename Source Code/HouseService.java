package com.houserent.service;

import com.houserent.domain.House;

public class HouseService {
    private House[] houses;//保存House对象
    private int houseNum=1;
    private int idCounter=1;

    public HouseService(int size){
        houses=new House[size];//创建对象时指定数组大小
        houses[0]= new House(1,"jack","112","海淀区",2000,"未出租");
    }

    //find方法，返回house对象或者null
    public House findById(int findId){
        //遍历
        for (int i = 0; i < houseNum; i++) {
            if (findId==houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newhouse){
        //判断是否还可以继续添加
        if(houseNum==houses.length){
            System.out.println("数组已满，不能继续添加了。。。");
            return false;
        }
        houses[houseNum++]=newhouse;
        //我们要设置一个id自增长的机制，然后更新newHouse的id
        newhouse.setId(++idCounter);
        return true;
    }

    //list方法，返回houses
    public House[] list(){
        return houses;
    }
    //del方法，删除一个房屋信息
    public boolean del(int delId){
        //应当先找到要删除的房屋信息对应的下标
        int index=-1;
        for (int i = 0; i <houseNum ; i++) {
            if (delId==houses[i].getId()){
                index=i;//就使用index记录i
            }
        }
        if (index==-1){
            return false;
        }
        for (int i = index; i <houseNum-1 ; i++) {
            houses[i]=houses[i+1];
        }
        houses[--houseNum]=null;
        return true;
    }
}
