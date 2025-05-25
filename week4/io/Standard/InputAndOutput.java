package io.Standard;

public class InputAndOutput {
    public static void main(String[] args){
        //System类的 public static final InputStream in = null;
        //System.in 编译类型 InputStream
        //System.in 运行类型 BufferedInputStream 标准输入->键盘
        System.out.println(System.in.getClass());//java.io.BufferedInputStream

        //1.public static final PrintStream out = null;
        //2.System.out 编译类型 PrintStream
        //3.System.out 运行类型 PrintStream   标准输出->显示器
        System.out.println(System.out.getClass());
    }
}
