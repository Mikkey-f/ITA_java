package com.inherit_.dt01;

public class Base {
    public int n1 = 1;
    protected int n2 = 2;
    int n3 = 3;
    private int n4 = 4;

    public Base() {
        System.out.println("父类的构造器被调用");
    }
    public Base(String name) {
        System.out.println("父类的构造器2被调用");
    }

    //父类提供一个public的方法,返回N4
    public int getN4() {
        return n4;
    }

    public void f1() {
        System.out.println("方法1");
    }

    protected void f2() {
        System.out.println("方法2");
    }

    void f3() {
        System.out.println("方法3");
    }

    private void f4() {
        System.out.println("方法4");
    }

    //父类提供一个公共的方法使子类可以调用f4
    public void gf() {
        f4();
    }

}
