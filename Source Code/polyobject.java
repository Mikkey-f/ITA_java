package com.poly.Objectpoly;

import com.poly.Animal;

public class polyobject {
    public static void main(String[] args) {
        //体验对象多态的特点

        Animal animal=new Dog("xiaohua");
        //animal的编译类型是Animal，运行类型为Dog
        animal.cry();
        //运行时，animal的运行类型为Dog，所有cry是Dog的cry
        animal=new Cat("xiaohaung");
        animal.cry();
        //小猫喵喵叫
    }
}
