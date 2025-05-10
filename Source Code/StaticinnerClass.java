package InnerClass.Member;

public class StaticinnerClass {
    public static void main(String[] args) {
        Outer07 outer07 = new Outer07();
        outer07.m();
        //外部其他类 使用静态内部类
        //1.
        Outer07.Inner07 inner07 = new Outer07.Inner07();
        inner07.say();
        //2.
        //编写一个方法，返回一个Inner07的实例
        Outer07.Inner07 inner07_ = outer07.getInner();
        inner07_.say();
        //3.
        //在Outer07中编写一个静态方法，这样通过类名直接返回
        Outer07.Inner07 inner1 = Outer07.getInner1();
        inner1.say();
    }
}
class Outer07{
    private int n=100;
    private static String name = "sizhijun";
    //1.放在外部类的成员位置
    //2.使用static修饰
    private static void cry(){
        System.out.println("a");
    }

    static class Inner07{
        private static String name = "fangyao";
        public void say () {
            //可以访问外部类的所有静态成员
            //可以添加任意修饰符
            //作用域为整个类体
            System.out.println("外部类name=" + Outer07.name+ "  内部类name="+name);
            cry();
        }
    }

    public void m(){
        //外部类访问静态内部类
        Inner07 inner07 = new Inner07();
        inner07.say();
    }
    public Inner07 getInner(){
        return new Inner07();
    }
    static public Inner07 getInner1(){
        return new Inner07();
    }
}