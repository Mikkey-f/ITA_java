package day1Stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Streamdemo1 {
    public static void main(String[]args){
        /*Stream流的使用方法:1.先得到一条Stream流，把数据放上去。
        2.使用中间方法对流水线上的数据操作。
        3.使用终结方法对数据操作。
         */

        /*1.单列集合(方法名：default Stream<E> stream) Collection的默认方法。
          2.双列集合（方法名：无）无法直接获取stream流。(需要先转换为单列集合)
          3.数组 （方法名：public static<E>Stream<E>stream(T[] array) ) Arrays工具类中的静态方法。
          4.零散数据：（方法名:public static<T>Stream<T> of(T...values)）Stream接口的静态方法。
         */

        //1.单列集合获取Stream流
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"a","b","c","d");
        /*获取到一条流水线，并把集合数据放到流水线上*/
        Stream<String>stream1=list.stream();
        //用终结方法打印数据。
        stream1.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //法二：
        list.stream().forEach(s -> System.out.println(s));

        //2.双列集合。
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("aaa",111);
        hm.put("bbb",222);
        /*获取Stream流*/
        //法一；
        hm.keySet().stream().forEach(s -> System.out.println(s));
        //法二：
        hm.entrySet().stream().forEach(s->System.out.println(s));

        //3.数组。
        int[] arr={1,2,3,4,5,6};
        String []arr1={"a","b","c","d"};
        Arrays.stream(arr).forEach(s->System.out.println(s));
        Arrays.stream(arr1).forEach(s -> System.out.println(s));

        //4.零散数据。
        Stream.of(1,114514,1222).forEach(s->System.out.println(s));

        //注意：1.Stream接口中静态方法of的细节
        //方法的形参是可变参数，可以传零散的数据，也可以传数组。
        //但是数组必须是引用数据类型，如果传递基本类型，会把整个数组当作一个元素
    }
}
