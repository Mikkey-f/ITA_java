package com.poly.polyarr;

import com.extend_.improve_.student;

public class polyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 18);
        persons[1] = new Student("sizhijun", 19, 590);
        persons[2] = new Student("fangyao", 17, 300);
        persons[3] = new Teacher("zhang", 22, 2000);
        persons[4] = new Teacher("chen", 55, 20000);
        //循环遍历多态数组，调用say方法
        for (int i = 0; i < persons.length; i++) {
            //编译类型是person
            System.out.println(persons[i].say());//动态绑定机制

            //如何调用子类中的方法呢

            //persons[i].teach();
            //persons[i].study();
            //错误，编译类型为Person，Person中没有这些方法

            if(persons[i] instanceof Student){//类型判断
                Student student=(Student) persons[i];//向下转型
                student.study();
                //等价于
                // ((Student)persons[i]).study();
            }else if(persons[i] instanceof Teacher){
                Teacher teacher=(Teacher) persons[i];
                teacher.teach();
                //等价于
                //((Teacher)persons[i]).teach();
            }else if(persons[i] instanceof Person){

            } else {
                System.out.println("你输入的类型有误，请自己检查一遍。。。");
            }

        }
    }
}
