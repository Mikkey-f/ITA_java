package com.poly.Objectpoly;

import com.poly.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void cry() {
        System.out.println("Cat cry() 小猫喵喵叫");
    }
}
