package day2;

/*   匿名内部类   */
public class Test01 {
    public static void main(String[]args){
        /*1.---->常规方法   */
        /*--->human sc=new human();
        --->act(sc);*/
        act(      /*2.----->匿名内部类   ---->整体是一个类的子类对象或一个接口的实现类对象*/
              new Animal(){   /*继承了Animal类*/
                  public void eat(){
                      System.out.println("米饭");
                  }
              }




        );
    }
    public static void act(Animal a){
        a.eat();
    }
}
