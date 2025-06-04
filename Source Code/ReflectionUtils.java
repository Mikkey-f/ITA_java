package com.szj.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 司志俊
 * @version 1.0
 * 演示如何通过反射获取类的结构信息
 */
public class ReflectionUtils {
    public static void main(String[] args) throws Exception{
        new ReflectionUtils().api_02();
    }

    public void api_02() throws Exception{
       Class<?> personCls = Class.forName("com.szj.reflection.Person");
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性= " + declaredField.getName()
            + " 该属性的修饰符值=" + declaredField.getModifiers()
            + "该属性的类型= " + declaredField.getType());
        }
        //getDeclaredMethods获取本类中所有的方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法=" + declaredMethod.getName()
            + " 该方法的访问修饰符=" + declaredMethod.getModifiers()
            + " 该方法返回的类型" + declaredMethod.getReturnType());
            //输出当前这个方法的形参数组情况
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该方法的形参类型=" + parameterType);
            }
        }

        //getDeclaredConstructors 获取本类中所有的构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("本类中所有的构造器=" + declaredConstructor.getName());//这里只是输出名 本类中所有的构造器=com.szj.reflection.Person
            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该构造器的形参类型=" + parameterType);
            }
        }
    }
    //第一组方法API
    public void api_01() throws Exception{
        Class<?> personCls = Class.forName("com.szj.reflection.Person");
        personCls.getName();//获取全类名 com.szj.reflection.Person
        personCls.getSimpleName();//获取简单类名 Person
        personCls.getFields();//获取所以public修饰的属性，包含本类和父类
        //.......
    }
}

class S {
    public String hobby;

}

class Person extends S{

    //属性
    public String name;
    protected static int age;
    String job;
    private double sal;

    public Person(){}
    public Person(int age){}
    public Person(String name,int age){}

    //方法
    public void m1(){

    }
    protected String m2(String s,int age,double d){
        return "";
    }
    void m3(int a){

    }
    private void m4(){

    }

}