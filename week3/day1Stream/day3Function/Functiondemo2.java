package day3Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Functiondemo2 {
    public static void main(String[]args){
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"张三-15","李四-16","王五-17");
       List<Student>newlist=list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String[]arr=s.split("-");
                String Name=arr[0];
                int Age=Integer.parseInt(arr[1]);
                return new Student(Name,Age);
            }
        }).collect(Collectors.toList());   //法一。
        // 法二：引用构造。
        List<Student>newlist1=list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newlist1);
    }
}
