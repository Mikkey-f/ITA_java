package codeblock_.detail;

public class dt02 {
    public static void main(String[] args) {
        A a = new A();//(1)
    }
}
class A{
    public int n2= getN2();
    private static int n1=getN1();
    public A(){
        System.out.println("无参构造器被调用");
    }

    public int getN2(){
        System.out.println("getN2()被调用。。。。");
        return 200;
    }
    {
        System.out.println("普通代码块。。。。");
    }
    static {
        System.out.println("A 静态代码块01");
    }
    public static int getN1(){
        System.out.println("getN1被调用。。。。");
        return 100;
    }
}