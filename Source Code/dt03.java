package codeblock_.detail;

public class dt03 {
    public static void main(String[] args) {
        new BBB();

    }
}
class AAA{
    {
        System.out.println("AAA的普通代码块");
    }
    public AAA() {
        System.out.println("AAA的AAA()构造器被调用");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB的普通代码块");
    }

    public BBB() {
        //(1)super()
        //(2)调用本类普通代码块
        System.out.println("BBB()构造器被调用");
    }
}