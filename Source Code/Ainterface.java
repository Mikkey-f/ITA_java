package interface_;

public interface Ainterface {
    //写属性
    public int n1 = 10;
    //方法
    //在接口中，抽象方法可以省略abstract关键字
    public void hi();

    //在jdk8后，可以有默认实现方法，需要使用default关键字修饰
    public default void ok(){
        System.out.println("ok,......");
    }
    //在jdk8后，可以有静态方法
    static public void cry(){
        System.out.println("cry.......");
    }
}
