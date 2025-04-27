package com.encap;

public class encapsulation {
    public static void main(String[] args) {
        Person r = new Person();
        //r.age=19;//错误
        r.setName("fy");
        System.out.println(r.getName());
        r.setAge(19);
        System.out.println(r.getAge());
        r.setSalary(30000);
        System.out.println(r.getSalary());
        //System.out.println(r.salary);不能直接访问，得通过getSalary方法
        Person1 p = new Person1("sizhijun", 19, 0);
        p.info();//通过构造器访问使得set方法失效了

    }
}

class Person1 {
    public String name;
    private int age;
    private double salary;

    public Person1() {

    }

    public Person1(String name, int age, double salary) {
//        this.name=name;
//        this.age=age;
//        this.salary=salary;
        setName(name);
        setSalary(salary);
        setAge(age);
    }

    public String getName() {
        return name;
    }
    //手写太慢，使用快捷键

    public void setName(String name) {
        //加入对数据的判断
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("输入name长度不对");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //判断年龄
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("输入年龄不对");
            this.age = 18;
        }

    }

    public double getSalary() {
        //增加权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void info() {
        System.out.println("这个人的信息" + name + "\t" + age + "\t" + salary);
    }
}