package Set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 司志俊
 * @version 1.0
 */
@SuppressWarnings({"all"})
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