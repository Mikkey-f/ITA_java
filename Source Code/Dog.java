package com.poly.Objectpoly;

import com.poly.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void cry() {
        System.out.println("Dog cry()  小狗汪汪叫");
    }
}

