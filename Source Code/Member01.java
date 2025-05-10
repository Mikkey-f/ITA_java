package InnerClass.Member;

public class Member01 {
    public static void main(String[] args) {
        Outer06 outer06 = new Outer06();
        //外部其他类使用成员内部类的两种方式
        //1.
        //语法，不用纠结
        Outer06.Inner06 inner06_=outer06.new Inner06();

        //2.
        //在外部类中编写一个方法，返回inner06对象
        Outer06.Inner06 inner06Instance = outer06.getInner06();
        inner06Instance.say();

    }
}
class Outer06{
    public int n = 11;
    public String name = "sizhijun";

    public void t2(){
        System.out.println("访问t2方法");
    }

    //1.成员内部类定义在成员位置
    //2.可以添加任意访问修饰符
    class Inner06{
        private int n = 199;
        public void say(){
            //重名，遵循就近原则
            System.out.println("n = " +n +"  name = "+name);//199
            System.out.println("访问outer06的n " + Outer06.this.n);//11
            t2();
        }
        //t2();错误，不能在方法外使用
    }

    public void t1(){
        //使用成员内部类
        Inner06 inner06 = new Inner06();
        inner06.say();
        System.out.println(inner06.n);
    }
    public Inner06 getInner06(){
        //返回Inner06的实例
        Inner06 inner061 = new Inner06();
        return inner061;
    }
}