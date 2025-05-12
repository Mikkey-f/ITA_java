package exception;

/**
 * @author 司志俊
 * @version 1.0
 */
public class ClassCastException_ {
    public static void main(String[] args) {
        A b = new B();//向上转型
        B b2 = (B)b;//向下转型
        C c = (C)b;
    }
}
class A{}
class B extends A{}
class C extends A{}