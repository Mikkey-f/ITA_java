package day2leibulei;

public class Test {
    public static void main(String[]args){
        /*1.1   Car.engine car=new Car().new engine();
        car.show();*/
        /*1.2    */
        /*Car c=new Car();
        System.out.println(c.getinstance());*/

        /*2 --->静态内部类
        Outer.inner c=new Outer.inner();
        c.show1();
        c.shpw2();*/

        /*3 ----->局部内部类 */
        Outer2 sc=new Outer2();
        sc.show();
    }

}
