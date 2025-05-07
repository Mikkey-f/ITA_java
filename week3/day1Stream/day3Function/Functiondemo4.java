package day3Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Functiondemo4 {
    public static void main(String[]args){
        //引用数组的构造方法:
        //1.格式:数据类型[]::new
        //细节:数组的类型跟流中数据的类型保持一致。
        ArrayList<Integer>list=new ArrayList<>();
        Collections.addAll(list,1,1,4,5,1,4);
        Integer[] arr1 = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr1));

    }
}
