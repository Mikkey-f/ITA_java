# try-catch

## 一.说明

![](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250511172631572.png)





## 二.注意事项

![image-20250511172738786](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250511172738786.png)

![image-20250511184303877](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250511184303877.png)

```java
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
```





![image-20250511184219864](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250511184219864.png)

```java
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



```

![image-20250511203143877](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250511203143877.png)





## 三.实例

![image-20250511205512649](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250511205512649.png)

```java
package exception.try_;

import java.util.Scanner;

/**
 * @author 司志俊
 * @version 1.0
 */
public class instence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            try {
                System.out.println("请输入一个整数：");
                num = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }
        }
        System.out.println("你输入的整数是：" + num);
    }
}
```
