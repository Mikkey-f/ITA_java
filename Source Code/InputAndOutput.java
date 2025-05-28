package standard;

import java.util.Scanner;

/**
 * @author 司志俊
 * @version 1.0
 */
public class InputAndOutput {
    public static void main(String[] args) {
        //标准输入 键盘
        //System 类的 public static final InputStream in = null;
        //System.in 的编译类型 InputStream
        //System.in 的运行类型 BufferedInputStream
        System.out.println(System.in.getClass());

        //标准输出 显示器
        //System.out 类的 public static final PrintStream out = null;
        //System.out 编译类型 PrintStream
        //System.out 运行类型 PrintStream
        System.out.println(System.out.getClass());
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入内容");
        String next = scanner.next();
        System.out.println(next);
    }
}
