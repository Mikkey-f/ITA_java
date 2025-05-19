package Set;

import java.util.HashSet;

/**
 * @author 司志俊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSet_ {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("szj");
        set.add("fy");
        set.add(new Dog("hei"));
        set.add(new Dog("hei"));//ok
        System.out.println("set=" + set);

        //再加深，经典面试题
        set.add(new String("aaa"));//ok
        set.add(new String("aaa"));//加入不了
        System.out.println(set);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

