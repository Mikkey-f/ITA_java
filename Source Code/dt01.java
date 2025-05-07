package codeblock_.detail;

public class dt01 {
    public static void main(String[] args) {
        //创立对象示例时加载
        AA aa = new AA();
        //创建子类对象时，父类也会被加载,而且父类先被加载
        BB bb = new BB();
        //使用类的静态成员时，类会被加载，
        System.out.println(Cat.n);
          CC cc = new CC();
          CC cc1=new CC();
        //静态代码块只被执行了一次
        //动态代码块每创建一个对象才执行一次，和类加载与否没有关系
        System.out.println(CC.c);//静态代码块被执行
    }
}

class CC{
    public static int c=100;
    static {
        System.out.println("CC的静态代码块被执行。。。。。");
    }
    {
        System.out.println("CC的静态代码块被执行。。。。。");
    }
}
class AA{
    static {
        System.out.println("AA的静态代码块被执行。。。");//1
    }
}
class BB extends AA{
    static {
        System.out.println("BB的静态代码块被执行。。。。。");//2
    }
}
class Cat extends Animal{

    public static int n=999;

    static {
        System.out.println("Cat的静态代码块被执行。。。。。");
    }
}
class Animal{
    static {
        System.out.println("Animal的静态代码块被执行。。。。。");
    }
}