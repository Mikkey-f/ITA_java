package abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal{
    private String Name;

    public Animal(String name) {
        Name = name;
    }
    //父类方法不确定性
//    public void eat(){
//        System.out.println("这是一个动物，不知道吃什么。。");
//    }
    //当一个类中存在抽象方法时，需要将该类声明为abstract类
    //由其子类完成抽象方法
    public abstract void eat();
}