package com.poly.detail2;

public class test {
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println(aa instanceof AA);//true
        System.out.println(aa instanceof BB);//false
        AA a = new BB();
        System.out.println(a instanceof AA);//true
        System.out.println(a instanceof BB);//true
        Object obj = new Object();
        String s = "sizhijun";
        System.out.println(s instanceof Object);//true
    }
}

class AA {
}

class BB extends AA {
}