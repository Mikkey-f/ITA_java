package com.szj.reflection;

import java.lang.reflect.Field;

/**
 * @author 司志俊
 * @version 1.0
 * 演示访问操作属性
 */
public class ReflecAccessProperty {
    public static void main(String[] args) throws Exception{
        Class<?> stuClass = Class.forName("com.szj.reflection.Student");

        Object o = stuClass.newInstance();

        //使用反射得到age 属性对象
        Field age = stuClass.getField("age");
        age.set(o,88);//通过反射来操作属性
        System.out.println(age.get(o));//返回age属性的值

        //操作name对象
        Field name = stuClass.getDeclaredField("name");
        //对name 进行暴破，可以操作private 属性
        name.setAccessible(true);
        //name.set(o,"szj");等价于
        name.set(null,"szj");//name是static的，因此o也可以写为null
        System.out.println(o);
        //System.out.println(name.get(null));

    }
}
class Student {
    public int age;
    private static String name;

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}