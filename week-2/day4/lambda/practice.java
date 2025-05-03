package day4.lambda;

import java.util.Arrays;
import java.util.Comparator;

//练习:将字符串按长度进行排序。
public class practice {
    public static void main(String[]args){
        String[]arr={"aaaa","aaaaa","aa","aaa"};
        Arrays.sort(arr,(String o1,String o2)->{
            return o1.length()-o2.length();
        });
        System.out.println(Arrays.toString(arr));
        String[]arr1={"aaaa","aaaaa","aa","aaa"};
        Arrays.sort(arr1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(Arrays.toString(arr1));
    }
}
