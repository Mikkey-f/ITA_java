package com.inherit_.dt01;

public class Sub extends Base {
    public Sub(){
        //默认调用父类的构造器
        super("tom");
        System.out.println("子类的构造器被调用");
    }
    public Sub(String name){
        super("tom");
        System.out.println("子类的构造器2被调用");
    }
    public void ff(){
        //System.out.println(n1+n2+n3+n4);//报错，不能使用n4
        System.out.println(n1+n2+n3);
        //f4();//错误
        System.out.println("n4="+getN4());
    }
}
