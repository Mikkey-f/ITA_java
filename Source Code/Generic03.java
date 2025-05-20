package generic;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Generic03 {
    public static void main(String[] args) {
        Person<String> person = new Person<>("szj");

    }
}
//泛型作用：再类声明时通过一个标识符表示某个属性的类型
//或者是某个方法的返回值的类型，或者是参数类型
class Person<E>{
    E s;//E在定义Person对象的时候指定，即在编译期间，就确定E是什么类型

    public Person(E s) {
        this.s = s;
    }

    public E ff(){
        return  s;
    }
}