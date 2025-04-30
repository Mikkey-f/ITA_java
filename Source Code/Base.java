package com.poly.detail01;

public class Base {
    int count=10;
}

class Sub extends Base{
    int count =1;
}
class test{
    public static void main(String[] args) {
        //属性没有重写之说，属性的值看编译类型
        Base base =new Sub();
        System.out.println(base.count);//输出10
    }
}