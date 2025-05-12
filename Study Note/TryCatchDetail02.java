package exception.try_;

/**
 * @author 司志俊
 * @version 1.0
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {
        try {
            int n1=100;
            int n2=0;
            System.out.println(n1/n2);//执行到这一步时，程序就破溃了，但还会执行finally
        }finally {
            System.out.println("执行了finally");
        }

        System.out.println("程序继续执行。。。。");//不会被执行
    }
}
