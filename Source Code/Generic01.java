package generic;

import java.util.ArrayList;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Generic01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(new Dog("huang",10));
        arrayList.add(new Dog("hei",6));
        arrayList.add(new Dog("bai",9));

        arrayList.add(new Cat("mimi",2));
        //遍历
        for (Object o : arrayList) {
            Dog dog = (Dog) o;
            System.out.println(dog.getName()+ "-" +dog.getAge());
        }

    }
}
class Dog{
    private String name;
    public int age;

    public Dog(String name, int age) {
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
class Cat{
    private String name;
    public int age;

    public Cat(String name, int age) {
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