package main_;

public class Main1 {
    private int age =1;
    public static String name="ss";
    public static void ss(){
        System.out.println("name="+ name);
    }
    public void cry(){
        System.out.println("ss");
    }

    public static void main(String[] args) {
        //可以直接使用name
        //静态方法main可以直接访问本类的静态成员
        System.out.println(name);
        ss();
        //System.out.println(age);//错误
        //cry();//错误
        //静态方法main要访问本类的非静态成员，需要先创建对象，在调用即可
        Main1 main1 = new Main1();
        main1.cry();
        System.out.println(main1.age);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
