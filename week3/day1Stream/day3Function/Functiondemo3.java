package day3Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.function.Function;

//使用类名引用成员方法
public class Functiondemo3 {
    public static void main(String[]args){
        /*格式: 类名::成员方法
        范例:String::substring
        规则:被引用方法的形参，需要跟抽象方法的第二个形参到最后一个形参保持一致，返回值需要保持一致

        抽象方法的形参详解:
        第一个参数:表示被引用方法的调用者，决定了可以引用那些类中的方法，
        在Stream流中，第一个参数一般表示流里面的每个数据，假设流里面的是字符串，那么只能引用String这个类中的方法

        第二个参数到最后一个参数:跟被引用方法的形参一致，若无第二个参数，说明被引用方法是无参的成员方法。
         */


        //将集合中的一些字符串，变成大写后输出。
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");
        list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(s -> System.out.println(s));//AAA BBB CCC DDD
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
