package Day7ExceptionPractice;

public class Studenclass {
    private String name;
    private int age;

    public Studenclass() {
    }

    @Override
    public String toString() {
        return "Studenclass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Studenclass(String name, int age) {
        this.name = name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18||age>40){
            throw new RuntimeException();
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len=name.length();
        if(len<3||len>10){
            throw new RuntimeException();
        }
        this.name = name;
    }
}
