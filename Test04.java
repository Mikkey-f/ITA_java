public class Test04 {
    public static void main(String[] args) {
        A a=new A();
        a.f1();
    }
}
class A{
    private final String NAME="哈哈哈";
    public void f1() {
        class B {
            private final String NAME = "韩顺平教育";
            public void show() {
                System.out.println("B的NAME=" + NAME+" A的NAME="+A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}