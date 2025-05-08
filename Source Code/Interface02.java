package interface_;

public class Interface02 {
    public static void main(String[] args) {

    }
}
//如果一个类implements 一个接口
//则需要将该接口的所有抽象方法都实现
class A implements Ainterface{
    public void hi(){
        System.out.println("hello");
    }
}