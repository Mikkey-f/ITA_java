# Equals

## 一.==

![image-20250429202743222](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250429202743222.png)

```java
package com.object_.equals;

public class e1 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = a;
        System.out.println(b == c);//true
        B bobj = a;//这里进行了向上转型。由于 A 是 B 的子类，把 A 类型的对象赋值给 B 类型的引用变量是可行的，
        // 因为子类对象能够被看作是其父类对象。
        System.out.println(bobj == c);//true
        A aobj = bobj;//错误
        //此处是向下转型。向下转型需要显式类型转换，并且要保证引用变量实际指向的对象类型是目标类型或者其子类型。
        // bobj 是 B 类型的引用变量，虽然它指向的是 A 类型的对象，但编译器仅知道它是 B 类型，
        // 所以不能直接把 B 类型的引用变量赋值给 A 类型的引用变量，必须进行显式类型转换。
        System.out.println(aobj == a);
    }
}

class A extends B {}

class B {}
```

![image-20250429213615259](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250429213615259.png)



## 二.重写equals

## 1. 判断两个Person对象的各个属性值是否都一样

```java
package com.object_.equals.example;

public class e1 {
    public static void main(String[] args) {
        Person person1 = new Person("sizhijun", 19, '男');
        Person person2 = new Person("sizhijun", 19, '男');
        System.out.println(person1.equals(person2));
        //如果没有在子类Person中重写equals方法，则判断是否为同一个对象，返回false
        //重写之后返回true
    }
}

class Person {//extends object
    private String name;
    private int age;
    private char gender;

    //重写Object 的 equals 方法
    public boolean equals(Object obj) {
        //判断是不是同一个对象
        if (this == obj) {
            return true;
        } else if (obj instanceof Person) {//用于判断 obj 是否是 Person 类（或其子类）,是Person才进行比较

            //进行向下转型，因为要得到obj的各个属性
            Person p = (Person) obj;
            return p.name == this.name && p.age == this.age && p.gender == this.gender;
        }

        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
```

## 2.

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250430171423823.png" alt="image-20250430171423823"  />



## 3.

![image-20250430171754330](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250430171754330.png)e