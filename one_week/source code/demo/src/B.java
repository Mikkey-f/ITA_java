package com.xiushifu;

public class B {
    public void f2(){
        A a=new A();
        //同一个包不能访问private
        //System.out.println("n1=" + a.n1 + "n2=" + a.n2 + "n3=" + a.n3 + "n4=" + a.n4);
        System.out.println("n1=" + a.n1 + "n2=" + a.n2 + "n3=" + a.n3 );
    }
}
