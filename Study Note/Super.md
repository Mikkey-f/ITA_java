# Super

## 一.介绍

在 Java 里，`super` 是一个关键字，它主要用于引用父类的成员，包括成员变量、方法以及构造方法。



## 二.基本语法

![image-20250427155653435](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250427155653435.png)

### 示例：

```java
package com.super_;

//A
public class A {
    public int n1 = 1;
    protected int n2 = 2;
    int n3 = 3;
    private int n4 = 4;
    public A(){

    }
    public A(int a){

    }
    public A(String a){

    }
    public A(int a,String b){

    }
    public void f1(){
        System.out.println("这是方法1");
    }
    protected void f2(){
        System.out.println("这是方法2");
    }
    void f3(){
        System.out.println("这是方法3");
    }
    private void f4(){
        System.out.println("这是方法4");
    }
}

//B
public class B extends A{
    //访问父类的属性
    public B(){
        //super();
        //super(1);
        super(2,"sizhijun");
       // super("fangyao");

    }
    public void f(){
        System.out.println(super.n1+super.n2+super.n3);
    }
    //不能访问n4
    public void fi(){
        super.f1();
        super.f2();
        super.f3();
        //super.f4();//错误
    }
}
```





## 三.优点

![image-20250427202939735](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250427202939735.png)

```java
//B类的方法sum

public void sum(){
        System.out.println("这是B类的方法...");
        //想调用父类A的test方法
        //有三种方法
        test();
        this.sum();
        super.test();
        //找test方法顺序：先找本类，如果有，就调用，如果没有就找父类。还没有就找父类的父类
        //提示：如果查找方法时，找到了但不能访问或者没有这个方法，就报错
        //属性也是一样的
    }
```



![](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250427203455590.png)





## 四.super和this的区别

![image-20250427204524263](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250427204524263.png)

