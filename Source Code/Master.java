package com.poly;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //主人给小狗喂食骨头
    public void feed(Dog dog,Bone bone){
        System.out.println("主人"+name+"给"+dog.getName()+"喂食"+bone.getName());
    }
    //主人给小猫喂食鱼
    public void feed(Cat cat,Fish fish){
        System.out.println("主人"+name+"给"+cat.getName()+"喂食"+fish.getName());
    }
    //使用多态可以统一管理主人喂食物的问题
    //animal的编译类型是Animal，可以指向（接收）Animal子类的对象
    //food的编译类型是Food，可以指向（接收）Food子类的对象
    public void feed(Animal animal,Food food){
        System.out.println("主人"+name+"给"+animal.getName()+"喂食"+food.getName());
    }
}
