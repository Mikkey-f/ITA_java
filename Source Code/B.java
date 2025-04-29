package com.override;

public class B extends A {
    //因为B是A的子类
    //方法cry都一样，就说B的cry方法重写了A的cry方法
    public void cry() {
        System.out.println("小狗在叫唤....");

    }

    public String n() {
        return null;
    }
//    protected void eat(){
//
//    }//错误
    //子类不能改变父类方法的访问范围
    public void s() {

    }//正确
    //子类可以扩大父类方法的访问范围
}

