package generic;

import java.util.*;

/**
 * @author 司志俊
 * @version 1.0
 */
public class GenericExer {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",18));
        students.add(new Student("tom",19));
        students.add(new Student("szj",20));

        for (Student o : students) {
            System.out.println(o);
        }

        HashMap<String, Student> hm = new HashMap<String,Student>();
        hm.put("tom",new Student("szj",20));
        hm.put("jack",new Student("jack",18));
        hm.put("szj",new Student("szj",20));

        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }
    }
}
class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}