package com.xiushifu;

public class A {
    public int n1 = 1;
    protected int n2 = 2;
    int n3 = 3;
    private int n4 = 4;

   public void f1() {
        //访问四个属性
        System.out.println("n1=" + n1 + "n2=" + n2 + "n3=" + n3+"n4="+n4 );
    }
    protected void f2(){}
    void f3(){};
   private void f4(){}
}
