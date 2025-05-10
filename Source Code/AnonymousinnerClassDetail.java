package InnerClass;

public class AnonymousinnerClassDetail {
    public static void main(String[] args) {
        new Outer05().f1();
    }
}

class Outer05 {
    private int n1 = 99;

    public void f1() {
        //创建一个基于类的匿名内部类
        //class 匿名内部类 extends person {}
        Person p = new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法");
            }
        };

        p.hi();//动态绑定，运行类型是Uoter05$1
        new Person() {
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法,hhhhhhhh");
            }
        }.hi();

        new Person() {
            @Override
            public void ok(String s) {
                super.ok(s);//未重写，回到Person类
            }
        }.ok("sizhijun");
    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");
    }

    public void ok(String s) {
        System.out.println("ok  " + s);
    }
}