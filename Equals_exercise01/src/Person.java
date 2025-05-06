import java.rmi.server.ObjID;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //重写Person类的equals方法，变为判断对象的各个属性是不是相同
    public boolean equals(Object obj){
        if(this==obj)//1.判断这两个引用是不是指向同一个对象，如果是那属性肯定一样啊
            return true;
        if(obj instanceof Person) {//指向的都是Person或者它的子类才能比较，就像人和人才能比较，你不能把人和狗进行比较
            Person p=(Person) obj;//向下转型才能访问Person的属性，因为Object是父类，不能访问子类的特有属性
            if(this.name.equals(p.name)&&this.age==p.age&&this.gender.equals(p.gender))
                return true;
        }
        return false;
    }
}
class Student extends Person{
    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }
}
class A{
    private String name;
    private int age;
    private String gender;

    public A(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}