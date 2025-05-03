package day3;

import java.util.Arrays;
import java.util.Comparator;

public class lambdatest {
    public static void main(String[]args){
        /*lambda的省略规则:1.参数类型可以省略不写。
        2.如果只有一个参数，参数类型可以不写，同时()也可以省略。
        3.如果lambda表达式的方法体只有一行，大括号，分号，return都可以不写，但要同时省略。
         */
        //1.匿名内部类
        Integer []arr={1,2,3,14,51,34};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(Arrays.toString(arr));

        //2.lambda表达式。
        /*Integer []arr={1,2,3,14,51,34};
        Arrays.sort(arr,(Integer o1,Integer o2)->{
            return o1-o2;
        });
        System.out.println(Arrays.toString(arr));*/
        /*1. method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("在游泳");
            }
        });*/
        /*2.lambda*/
        method(()-> {
                System.out.println("在游泳");
            }
        );

    }
    public static void method(Swim s){
        s.swimming();
    }
}
