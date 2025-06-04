package com.szj.reflection;

import com.szj.Cat;

import java.lang.reflect.Method;

/**
 * @author 司志俊
 * @version 1.0
 * 测试反射调用的性能和优化方案
 */
public class Reflection {
    public static void main(String[] args) throws Exception{
        m1();
        m2();
        m3();
    }
    //传统方法调用hi
    public static void m1(){
        long st = System.currentTimeMillis();
        Cat cat = new Cat();
        for (int i = 0; i < 900000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法耗时：" + (end-st));
    }

    //反射机制调用hi
    public static void m2() throws Exception{
        Class aClass = Class.forName("com.szj.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        long st = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射调用方法耗时：" + (end-st));
    }

    //反射调用优化 + 关闭访问检查
    public static void m3() throws Exception{
        Class aClass = Class.forName("com.szj.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        hi.setAccessible(true);//在反射调用方法时，取消访问检查
        long st = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("优化反射调用方法耗时：" + (end-st));
    }
}
