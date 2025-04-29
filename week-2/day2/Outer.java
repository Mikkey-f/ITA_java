package day2;

/*2.内部类-------静态内部类。*/
public class Outer {
    String name="张三";
    int a=10;
    static int b=20;
    static class inner{
        Outer c=new Outer();
        public void show1(){
            System.out.println(c.a);//如果这里我们直接输出a,会报错。--->调用非静态类要先创建对象。
        }
        public void shpw2(){
            System.out.println(b);
        }
    }

}
