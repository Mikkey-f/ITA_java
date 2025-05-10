package InnerClass;

/**
 * 演示匿名内部类
 */
public class AnonymousInner {
    public static void main(String[] args) {
        new Outer02().method();
    }
}

class Outer02{
    private int n1 = 10;
    public void method(){

        //基于接口的匿名内部类
        //tiger的编译类型是IA
        //tiger的运行类型就是匿名内部类
        //在new时，jdk底层在创建匿名内部类Outer02$1时，立马创建了Outer02$1的实例对象
        //并且把地址返回给tiger
        //匿名内部类使用一次，就不能再使用了,但tiger是一个对象，可以反复使用
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎在叫唤。。。");
            }
        };
        //等价于下面这个类
//        class Outer02$1 implements IA{
//            @Override
//            public void cry() {
//                System.out.println("老虎在叫唤。。。");
//            }
//        }

        System.out.println("tiger的运行内存："+tiger.getClass());//getClass得到对象的运行内存
        tiger.cry();
        tiger.cry();
        tiger.cry();//反复使用

        //演示基于类的匿名内部类
        //分析
        //1.father编译类型 Father
        //2.father运行类型 Outer02$2
        //3.底层会创建匿名类
        /**
         * class Outer04$2 extends Father{
         *    public void test(){
         *     System.out.println("匿名内部类重写了test（）方法");
         *    }
         * }
         */
        //4.同时也直接返回了 匿名内部类 Outer02$2的实例对象
        //5.注意（"sizhijun"）参数列表会传递给 构造器
        Father father = new Father("sizhijun"){
            public void test(){
                System.out.println("匿名内部类重写了test（）方法");
            }
        };
        System.out.println("father对象的运行类型=" + father.getClass());//Outer02$2

        //基于抽象类的匿名内部类
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头。。。");
            }
        };
    }
}
interface IA {
    public void cry();
}
class Father{
    public Father(String name) {
        System.out.println("接收到name=" + name);
    }
    public void test(){

    }
}
abstract class Animal{
    abstract void eat();
}