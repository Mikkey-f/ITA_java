package generic;

import java.util.ArrayList;

/**
 * @author 司志俊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generic02 {
    public static void main(String[] args) {
        //使用泛型
        //ArrayList<Dog1> 表示放到ArrayList 集合的元素是Dog1类型，不是就报错
        ArrayList<Dog1> arrayList = new ArrayList<Dog1>();
        arrayList.add(new Dog1("huang",10));
        arrayList.add(new Dog1("hei",6));
        arrayList.add(new Dog1("bai",9));

        //arrayList.add(new Cat1("mimi",2));

        //再遍历时可以直接取出Dog类型

        for (Dog1 dog1 : arrayList) {
            System.out.println(dog1.getName()+ "-" +dog1.getAge());
        }

    }
}

class Dog1{
    private String name;
    public int age;

    public Dog1(String name, int age) {
        this.name = name;
        this.age = age;
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
}
class Cat1{
    private String name;
    public int age;

    public Cat1(String name, int age) {
        this.name = name;
        this.age = age;
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
}
//泛型作用：再类声明时通过一个标识符表示某个属性的类型
//或者是某个方法的返回值的类型，或者是参数类型