package day4ErrorAndException;

import java.util.Arrays;

//异常
public class testdemo1 {
    public static void main(String[]args){
        /*Exception可以分为RuntimeException及其子类和其他异常。

        Error和Exception的区别（***）

        Error: 代表系统级别的错误（属于严重问题）

        Exxeption:叫做异常,代表程序可能出现的问题。通常用Exception及它的子类封装程序可能出现的问题

        运行时的异常:RuntimeException及其子类，编译阶段不会出现异常提醒。运行时出现的异常(如数组索引越界异常)

        编译时异常：编译阶段就出现的异常（如日期解析异常）
        //编译时异常:
        int []arr={1,2,3,4,5};
        System.out.println(arr[10]);*/
        /*编译时异常(java文件->字节码文件时）:不运行代码，只检查语法是否错误，或者做性能优化
        运行时异常(字节码文件->运行结果时）:程序出错而导致程序出现问题
         */

        /*异常的作用:1.是用来查询bug的关键参考信息。
        2.可以作为方法内部的特殊返回值，了解底层执行情况。
         */
        //2.->
       /*Student ss=new Student();
        ss.setAge(30);
        System.out.println(ss);出现异常*/


    }
}
