package day4andDay5ErrorAndException;

public class Student {
    private String name;
    private int age;

    public Student() {
    }
    public Student(String name,int age) {
        this.age=age;
        this.name=name;
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
        if(age<18||age>24){

            throw new RuntimeException();
        }
        else this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
