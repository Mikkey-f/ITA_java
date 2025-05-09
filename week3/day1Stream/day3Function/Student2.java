package day3Function;

public class Student2 {
    private String name;
    private int age;

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

    public Student2() {
    }
    public Student2(String name,int age){
        this.age=age;
        this.name=name;
    }

}
