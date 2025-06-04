package com.szj.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 司志俊
 * @version 1.0
 * 演示通过反射调用方法
 */
public class ReflecAccessMethod {
    public static void main(String[] args) throws Exception{
        Class<?> bossClass = Class.forName("com.szj.reflection.Boss");
        Object o = bossClass.newInstance();
        //调用public的hi方法
        //Method hi = bossClass.getMethod("hi",String.class);
        Method hi = bossClass.getDeclaredMethod("hi",String.class);
        hi.invoke(o,"szj");

        //调用private static 方法
        Method say = bossClass.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true);//say是私有方法
        System.out.println(say.invoke(o,100,"张三",'男'));
        System.out.println(say.invoke(null,200,"李四",'男'));//static 可以为空

        //在反射中，如果方法有返回值，统一返回object，但是他运行类型和方法定义的返回类型一致

    }
}
class Boss {
    public int age;
    private static String name;
    public Boss(){}
    private static String say(int n,String s, char c){
        return n+ " " + s + " " + c;
    }
    public void hi(String s){
        System.out.println("hi= " + s);
    }
}