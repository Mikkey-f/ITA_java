package day2leibulei;

/* 内部类----->局部内部类  */
public class Outer2 {
    int b=20;
    public void show() {
        int a = 10;
        class inner1 {
            String name;
            int age;
            public void show1(){
                System.out.println(a);
                System.out.println(b);
            }
        }
        inner1 sc=new inner1();
        System.out.println(sc.age+" "+sc.name);
        sc.show1();
    }
}
