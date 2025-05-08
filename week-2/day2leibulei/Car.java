package day2leibulei;
//内部类----成员内部类。
public class Car {
    String name;
    int age;
    /*1.   非private
    class engine{
        String enginrname;
        int useage;
        void show(){
            System.out.println("12345");
        }
    }*/
    /*2.    private*/
    private class engine{
        String enginename;
        int useage;
    }
    public engine getinstance(){
        return new engine();
    }
}
