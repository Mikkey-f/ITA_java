package day2Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class practice {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        List<Integer> list1 = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());//过滤奇数。
        System.out.println(list1);//2,4,6,8,10.
    }
}
