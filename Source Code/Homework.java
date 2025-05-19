import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 司志俊
 * @version 1.0
 */
@SuppressWarnings({"ALL"})
public class Homework {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("hei",3));
        list.add(new Dog("bai",2));
        list.add(new Dog("huang",4));

        for (Object dog : list) {
            System.out.println("dog="+dog);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog =  iterator.next();
            System.out.println("dog="+dog);

        }
    }
}
class Dog{
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}