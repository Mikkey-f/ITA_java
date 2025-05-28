package ioHomework;

import java.io.*;
import java.util.Properties;

public class Homework3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //一.先编写一个dog.properties
        Properties properties = new Properties();
        properties.setProperty("name", "tom");
        properties.setProperty("age", "5");
        properties.setProperty("color", "red");
        //传入文件
        properties.store(new FileWriter("week4andweek5\\dog.properties"), null);

        String name = new String(properties.getProperty("name"));//Object->String
        int age = Integer.parseInt(properties.getProperty("age"));//Object->int
        String color = new String(properties.getProperty("color"));//Object->String
        String pathname = "week4andweek5\\dog.properties";
        Dog dog = new Dog(name,age,color);
        //将创建的对象序列化到pathname对应的文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathname));
        oos.writeObject(dog);
        System.out.println("dog数据序列化完毕");
        oos.close();
        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathname));
        Object o = ois.readObject();
        Dog dog1=(Dog)o;
        //获取类名
        System.out.println(dog1.getClass());
        System.out.println(o);
        ois.close();
        System.out.println("数据反序列化完毕!");

//
//        String pathname="week4andweek5\\dog.properties";
//        //1.序列化
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathname));
//        oos.writeObject(new Dog("李四",10,"红色"));
//        System.out.println("数据序列化完毕");
//
//        //2.反序列化,输出到控制台上
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathname));
//        Object obj = ois.readObject();
//        System.out.println(obj);
//    }
    }
}
class Dog implements Serializable{
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}