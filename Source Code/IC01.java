package InnerClass;

public class IC01 {//外部其他类
    public static void main(String[] args) {
        Outer outer = new Outer(10);
        outer.m2();
        System.out.println("Outer的hashcode="+outer);
    }
}
class Outer{//外部类
    private int n1=100;

    public Outer(int n1) {
        this.n1 = n1;
    }
    private void m1(){}
    public void m2(){

        class Inner{//不能被public修饰，可以用final修饰
            private int n1=11;
            //可以直接访问外部类的所有成员，包含私有的
            public void f1(){
                System.out.println("n1="+n1);//就近原则，输出内部类的n1
                System.out.println("外部类的n1="+Outer.this.n1);
                //解释：Outer.this 本质就是外部类的对象，即哪个对象调用了m2，就是哪个对象
                //用hashcode是否一样判断
                System.out.println(Outer.this);
                m1();
            }
        }
        class Inner03 extends Inner{}//内部类可以被继承

        //外部类在方法中，可以创建Inner对象，然后调用方法即可
        Inner inner = new Inner();
        inner.f1();
    }

}