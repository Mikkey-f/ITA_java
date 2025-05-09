package day4ErrorAndException;

public class testdemo2 {
    public static void main(String[]args){
        /*细节:1. 如果try中没有遇到问题,会把try中所有的代码都执行,
                 不会执行catch中的代码。只有遇到异常，才执行catch中的代码。
              2. 如果try中遇到多个问题,要写多个catch与之对应.
                 如果我们要捕获多个异常,它们存在父子关系,那么父类一定要写在下面。
              3.如果try中的问题没有被捕获,将交给虚拟机处理,出现问题之后的代码全部不执行。
              4.如果try中遇到问题,try下面的代码不执行,直接执行catch中的代码。
         */

        //例1:
        int []arr={1,2,3,4,5};

        /*try{
            System.out.println(arr[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了"); 不执行
        }
        System.out.println("全部执行完成");   执行  */

        /* 例2.
        try{
            System.out.println(arr[10]);
            System.out.println(arr[2]/0);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("程序出错了");
        }
        System.out.println("全部执行完成");*/

        /* 例3:
            try {
            System.out.println(arr[10]);//之后的都不运行
        }catch (ArithmeticException e){
            System.out.println("索引越界了");
        }
        System.out.println("程序全部执行完了");
         */

        /*例4.
             try {
                System.out.println(arr[10]);
                System.out.println("是否执行了");//不会执行这句话
             }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("索引越界了");
             }
        System.out.println("全部执行完了");
         */

    }
}
