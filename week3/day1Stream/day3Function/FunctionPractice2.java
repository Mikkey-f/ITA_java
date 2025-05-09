package day3Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionPractice2 {
    public static void main(String[]args){
        //需求:创建集合添加学生对象，要求:获取姓名添加到集合中
        ArrayList<Student2>list=new ArrayList<>();
        list.add(new Student2("张三",15));
        list.add(new Student2("李四",18));
        list.add(new Student2("王五",19));
        String[] arr = list.stream().map(new Function<Student2, String>() {
            @Override
            public String apply(Student2 student2) {
                return student2.getName();
            }
        }).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
