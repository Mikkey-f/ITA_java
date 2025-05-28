package printstream_;

import java.io.PrintStream;

/**
 * @author 司志俊
 * @version 1.0
 */
public class PrintStream_ {
    public static void main(String[] args) throws Exception{
        PrintStream out = System.out;
        //默认情况下，PrintStream 输出数据的位置是 标准输出，即显示器
        out.print("sizhijun");
        /**
         * public void print(String s) {
         *         write(String.valueOf(s));
         *     }
         */
        //因为print底层使用的是write,所以我们可以直接调用write进行打印输出
        out.write("司志俊帅比".getBytes());
        out.close();

        //修改打印流输出的位置/设备
        //修改到e:\mm.txt
        System.setOut(new PrintStream("d:\\mm.txt"));
        System.out.println("帅帅的司志俊");
    }
}
