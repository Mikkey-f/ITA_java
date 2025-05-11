public class Integer01 {
    public static void main(String[] args) {
        int n1=100;
        //jdk5之前的方式
        //手动装箱
        Integer integer=new Integer(n1);
        Integer integer1=Integer.valueOf(n1);
        //手动拆
        int n2=integer.intValue();
        //jdk5之后的方式
        int m=10;
        Integer m2=m;//自动装箱
        Integer i=new Integer(99);
        int n3=i;//自动拆箱
    }
}
