package com.szj.reflection;

import com.szj.Cat;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 司志俊
 * @version 1.0
 * 反射问题的引入
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        //根据配置文件 re.properties 指定信息，创建Cat对象并调用方法hi

        //传统方法
//        Cat cat = new Cat();
//        cat.hi();-->cat.cry() 修改源码

        //1.使用properties类，可以读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        System.out.println("classfullpath=" + classfullpath + "   method=" + methodName);

        //2.创建对象,传统的方法行不通了
        //new calssfullpath();

        //3.使用反射机制解决
        //(1)加载类 返回class类型的对象
        Class aClass = Class.forName(classfullpath);
        //通过class可以得到你加载的类 com.szj.Cat 的对象实例
        Object o = aClass.newInstance();
        System.out.println(o.getClass());
        //(3) 通过aclass 得到你加载的类 com.szj.Cat 的 methodName 的方法对象
        //    即：在反射中把方法视为对象
        Method method1 = aClass.getMethod(methodName);
        //(4) 通过方法对象实现调用方法
        method1.invoke(o);

        //得到name字段
        //getField不能得到私有的属性
//        Field nameField = aClass.getField("name");
//        System.out.println(nameField.get(o));
        Field ageField = aClass.getField("age");
        System.out.println(ageField);
        System.out.println(ageField.get(o));

        //Constructor代表类的构造方法，Constructor对象表示构造器
        Constructor constructor = aClass.getConstructor();//返回无参构造器
        System.out.println(constructor);//Cat()
        Constructor constructor2 = aClass.getConstructor(String.class);//String.class就是String类的对象
        System.out.println(constructor2);//Cat(String name)
    }
}
