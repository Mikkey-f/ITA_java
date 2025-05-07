package day3Function;

public class Student1 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public Student1(String name,int age ) {
        this.name=name;
        this.age=age;
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

    public Student1() {

    }

    public Student1(String s) {
        String[]arr=s.split(",");
        this.name=arr[0];
        this.age=Integer.parseInt(arr[1]);
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
