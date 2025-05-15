package wrapper;

/**
 * @author 司志俊
 * @version 1.0
 */
@SuppressWarnings("all")
public class Integer01 {
    public static void main(String[] args) {
        //演示int<-->Integer的装箱和拆箱
        //手动装箱
        int n1 = 100;
        //Integer i = new Integer(n1);已被弃用
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        //Integer -> int
        int i = integer1.intValue();

        //自动装箱
        int n2 = 200;
        Integer integer2 = n2;//底层使用的是Integer.valueOf(n2)

        //自动拆箱
        int n3 = integer2;//底层仍然使用的是 intValue()方法
    }
}
