package exception;

/**
 * @author 司志俊
 * @version 1.0
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "sizhijun";
        //将 String 转成 int
        int num =  Integer.parseInt(name);
        System.out.println(num);
    }
}
