package throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Throws01 {
    //创建了一个文件流对象
    //1. 这里的异常是一个FileNotFoundException 编译异常
    //2. 使用前面讲过的 try-catch-finally
    //3. 使用throws ,抛出异常, 让调用f2方法的调用者(方法)处理
    //4. throws后面的异常类型可以是方法中产生的异常类型，也可以是它的父类
    //5. throws 关键字后也可以是 异常列表，即可以抛出多个异常
    public static void main(String[] args) {

    }
    public void f2() throws FileNotFoundException,NullPointerException,ArithmeticException{//Exception
        FileInputStream fileInputStream = new FileInputStream("d://aa.txtc");
    }
}

//3.
class Father{
    public void f() throws RuntimeException {
    }

    //使用throws
    public static void f1() throws FileNotFoundException{
        // 这里大家思考问题 调用 f2 () 报错
        // 解读
        //1. 因为 f2 () 方法抛出的是一个编译异常
        //2. 即这时，就要 f1 () 必须处理这个编译异常
        //3. 在 f1 () 中，要么 try-catch-finally , 或者继续 throws 这个编译异常
        f2();
    }
    //使用try-catch-finally
//    public static void f1(){
//        try {
//            f2();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//        }
//    }
    public static void f2() throws FileNotFoundException{
        FileInputStream fileInputStream = new FileInputStream("d://aa.txtc");
    }

    public void f3(){
        f4();
        //调用f4没问题
        //原因是f4() 抛出的是运行异常
        //java中不要求程序员显示处理，因为有默认处理机制
    }
    public void f4() throws ArithmeticException{

    }
}
class Son extends Father{
    public void method() throws ArithmeticException{

    }
}