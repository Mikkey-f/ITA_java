package interface_.detail;

public class Dt01 {
    public static void main(String[] args) {
        //new A();错误

    }
}
interface A{
    public void a();
    public void b();
}
class C implements A {

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
abstract class B implements A{}//抽象类去实现接口时，可以不实现接口方法