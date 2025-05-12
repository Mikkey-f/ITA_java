package exception.try_;

/**
 * @author 司志俊
 * @version 1.0
 */
public class TryCatchDetail01 {
    public static void main(String[] args) {
        //1.如果try代码块有可能有多个异常
        //2.可以使用多个catch 分别捕获不同的异常，相应处理
        //3.要求子类异常写在前面，父类异常写在后面
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());//NullPointerException
            int n1 = 10;
            int n2 = 0;
            int resw = n1/n2;//ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("空指针异常："+e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){

        }finally {
        }

    }
}
class Person{
    private String name = "jack";

    public String getName() {
        return name;
    }
}