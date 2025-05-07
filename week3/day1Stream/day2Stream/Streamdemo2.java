package day2Stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamdemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //Stream流的中间方法:
        //1.filter  过滤
        /*Collections.addAll(list,"张三","李四","王五");
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        }).forEach(s -> System.out.println(s));*/

        //2. limit 获取前几个元素   3.skip 跳过前几个元素。
        /*Collections.addAll(list,"a","b","c","d","e");
        list.stream().limit(3).forEach(s -> System.out.println(s));//a b c
        list.stream().skip(3).forEach(s -> System.out.println(s));//d e

         */
        //4.distinct 元素去重
        /*Collections.addAll(list,"a","a","a","b","c","d");
        list.stream().distinct().forEach(s -> System.out.println(s)); //a b c d

         */

        //5.concat: 合并a和b两个流为一个流。
        /*ArrayList<String>list1=new ArrayList<>();
        Collections.addAll(list,"a","b","c");
        Collections.addAll(list1,"1","2","3");
        Stream.concat(list1.stream(),list.stream()).forEach(s -> System.out.println(s));//abc123

         */

        //6.map: 数据类型转换
        /*Collections.addAll(list,"张三-14","李四-15","王五-16");
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {//apply的形参s:依次表示流里面的每个数据
                String[]arr=s.split("-");
                String age1=arr[1];
                int age=Integer.parseInt(age1);
                return age;
            }
        }).forEach(s->System.out.println(s));//14 15 16
        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s->System.out.println(s));*/
        /*--------------------------------------------------------------------------------------*/

        //Stream流的终结方法:
        /*1. forEach 遍历
        2.count 统计
        3.toArray 收集流中数据，放到数组中
        4.collect 收集流中数据，放到集合中
         */
        //3.  toArray
        /* IntFunction的泛型：具体类型的数组。
         apply的形参:流中数据的个数，要跟数组长度一致。
         apply的返回值:具体类型的数组
         toArray方法参数的作用:负责创建一个指定类型的数组
         toArray方法的底层。会依次得到流里面的每个数据，并把数据放到数组中
         toArray的返回值:装着流里面所有数据的数组


        Collections.addAll(list,"a","b","c","d","e");
        String[]arr=list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));
        String[]arr1=list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr1));*/

        //4.  collect
        //1.收集到list集合当中。
        Collections.addAll(list, "男-张三-13", "男-李四-15", "男-王五-16", "animal-李五-19");
        /*List<String> collect = list.stream().filter(s -> "男".equals(s.split("-")[0])).collect(Collectors.toList());
        System.out.println(collect);

        //2.收集到set集合中。
        Set<String>collect1=list.stream().filter(s -> "男".equals(s.split("-")[0])).collect(Collectors.toSet());
        System.out.println(collect1);*/

        //3.收集到Map集合中
        //toMap:参数一表示键的生成规则   参数二表示值的生成规则
        //参数1. Function泛型一：表示流中每个数据的类型 泛型二：表示键的数据类型
        //apply形参：依次表示流中的每个数据 方法体：生成键的代码，参数二同理。
        /*两种形式:
        Map<String,Integer>map3=list.stream().filter(s -> "男".equals(s.split("-")[0])).
                collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[1];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));
        System.out.println(map3);
        Map<String, Integer> map2 = list.stream().
                filter(s -> "男".equals(s.split("-")[0]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[1],
                        s -> Integer.parseInt(s.split("-")[2])));
       System.out.println(map2);*/
    }
}
