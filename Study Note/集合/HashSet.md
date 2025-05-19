# HashSet

## 一.说明

![image-20250519090307823](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250519090307823.png)

```java
public class HashSet_ {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("szj");
        set.add("fy");
        set.add(new Dog("hei"));
        set.add(new Dog("hei"));//ok
        System.out.println("set=" + set);

        //再加深，经典面试题
        set.add(new String("aaa"));//ok
        set.add(new String("aaa"));//加入不了
        System.out.println(set);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
```



## 二.数组链表模拟

![image-20250519093952657](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250519093952657.png)



## 三.HashSet扩容机制

![image-20250519143216194](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250519143216194.png)

**![image-20250519142331749](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250519142331749.png)**

![image-20250519185904358](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250519185904358.png)





## 四.源码解读





## 五.课堂练习

![image-20250519151445957](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250519151445957.png)



**生成快捷方法equals() 和 hashCode()，来决定name和age相同时hash值是否相同**

![image-20250519152558391](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250519152558391.png)

![image-20250519153018459](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250519153018459.png)

```java
public class Exercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("szj",19));
        hashSet.add(new Employee("fy",17));
        hashSet.add(new Employee("szj",19));
        //没有生成快捷方法equals() 和 hashCode()时，加入了三个
        //生成快捷方法equals() 和 hashCode()时，加入了两个
        System.out.println(hashSet);
    }
}
class Employee{
    String name;
    int age;

    public Employee(String name,int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //如果name和age相同，则返回相同的hash值

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
```



![image-20250519155110338](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250519155110338.png)

```java
public class Exercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Mydate mydate1 = new Mydate(2005, 5, 20);
        Mydate mydate2 = new Mydate(2007, 12, 10);
        hashSet.add(new Employee1("szj",mydate1));
        hashSet.add(new Employee1("fy",mydate2));
        hashSet.add(new Employee1("szj",mydate1));
        System.out.println(hashSet);
    }
}
class Employee1{
    private String name;
    Mydate birthday;

    public Employee1(String name, Mydate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(name, employee1.name) && Objects.equals(birthday, employee1.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}
class Mydate{
    int n;
    int m;
    int d;

    public Mydate(int n, int m, int d) {
        this.n = n;
        this.m = m;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "n=" + n +
                ", m=" + m +
                ", d=" + d +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mydate mydate = (Mydate) o;
        return n == mydate.n && m == mydate.m && d == mydate.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(n, m, d);
    }
}
```

