package day3Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Functionpractice {
    public static void main(String[]args){
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"张三,23","李四,25","王五,30");
        Student1[] arr1 = list.stream().map(Student1::new).toArray(Student1[]::new);
        System.out.println(Arrays.toString(arr1));
    }
}
