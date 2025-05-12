package exception.customexception;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Customexception {
    public static void main(String[] args) {
        int age = 800;
        //要求age在18-120
        if (age<18||age>120){
            throw new AgeException("年龄在18-120");
        }
        System.out.println("你的年龄范围正确");//异常就不会执行
        }
    }
//自定义的异常
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}