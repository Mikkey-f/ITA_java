package com.szj.reflection;

import java.lang.reflect.Constructor;

/**
 * @author 司志俊
 * @version 1.0
 * 演示通过反射机制创建实例
 */
public class ReflecCreateInstance {
    public static void main(String[] args) throws Exception{
        //1.获取到User类的Class对象
        Class<?> userClass = Class.forName("com.szj.reflection.User");

        //2.通过public的无参构造器创建实例
        Object o = userClass.newInstance();

        //3.通过public的有参构造器创建实例
        Constructor<?> constructor = userClass.getConstructor(String.class);//得到对应构造器
        Object szj = constructor.newInstance("szj");//传入实参

        //4.通过非public的有参构造器创建实例
        Constructor<?> declaredConstructor = userClass.getDeclaredConstructor(int.class, String.class);
        declaredConstructor.setAccessible(true);//暴破，使用反射可以访问私有的构造器/方法/属性
        Object user = declaredConstructor.newInstance(17, "fy");
        System.out.println(user);
    }
}

class User {
    private int age;
    private String name;
    public User(){}

    public User(String name){

    }
    private User(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}