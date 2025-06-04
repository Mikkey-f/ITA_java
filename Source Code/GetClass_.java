package com.szj.class_;

import com.szj.Car;

/**
 * @author 司志俊
 * @version 1.0
 * 演示得到Class对象的各种方法（6）
 */
public class GetClass_ {
    public static void main(String[] args) throws Exception{
        //1.Class.forName
        String classAllPath = "com.szj.Car";
        Class<?> cls1 = Class.forName(classAllPath);

        //2.类名.class,应用场景:用于参数传递
        Class cls2 = Car.class;
        System.out.println(cls2);

        //3.对象.getClass，应用场景：有对象实例
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);

        //4.通过加载器获取到类的Class对象
        //(1)先得到 car 类加载器
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2)通过类加载器得到Class对象
        Class cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        //5.
        Class<Integer> integerClass = int.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);//int

        //6.
        Class<Integer> type2 = Integer.TYPE;
        Class<Character> type1 = Character.TYPE;
        System.out.println(type1);
    }
}
