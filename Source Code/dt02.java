package codeblock_.detail;

public class dt02 {
    public static void main(String[] args) {
        A a = new A();//(1)
    }
}
class A{
    private static int n1=getN1();
    static {
        System.out.println("A 静态代码块01");
    }
    public static int getN1(){
        System.out.println("getN1被调用。。。。");
        return 100;
    }
}