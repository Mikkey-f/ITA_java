package day4andDay5ErrorAndException;

public class Throwable {
    public static void main(String[]args){
        //Throwable的成员方法
        /*1.public String getMessage() 返回此throwable的详细消息字符串
          2.public String toString() 返回此可抛出的简短描述
          3.public void printStackTrace() 把异常的错误信息输出在控制台
         */

        //例1:
        int []arr={1,2,3,4,5,6};
        try{
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            //1.getMessage
            /*String s=e.getMessage();
            System.out.println(s);  Index 10 out of bounds for length 6 */

            //2.toString
            /*String s=e.toString();
            System.out.println(s);java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6*/

            //3.printStackTrace() 在底层是利用System.err.println进行输出
            //把异常的错误信息以红色字体输出在控制台上，细节:仅仅是打印信息，不会停止程序运行
            e.printStackTrace();
            System.out.println("结束");
            System.err.println(123);
        }
    }
}
