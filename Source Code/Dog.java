package outputstream_;

import java.io.Serializable;

/**
 * @author 司志俊
 * @version 1.0
 */
//如果需要序列化某个类的对象，实现 Serializable 就好
public class Dog implements Serializable {
    private String name;
    private int age;
    //static 和 transient 修饰的属性不会被序列化
    private static String nation;
    private transient String color;

    //serialVersionUID 序列化的版本号，提高兼容性
    private static final long serialVersionUID = 1L;

    //序列化对象时，要求里面属性的类型也需要实现序列化接口
    private Master master = new Master();

    public Dog(String name, int age, String color, String nation) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.nation = nation;
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' + ", nation=" + nation +
                ", master=" + master +
                '}';
    }
}
