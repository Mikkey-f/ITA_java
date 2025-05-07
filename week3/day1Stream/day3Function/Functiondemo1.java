package day3Function;

import java.util.Arrays;

public class Functiondemo1 {
    public static void main(String[]args){
        //方法引用:把已有的方法拿过来用，当作函数式接口中抽象方法的方法体
        Integer []arr={1,3,2,4,6,5};
        //1.lambda
        /*Arrays.sort(arr,(Integer o1,Integer o2)->{
            return o2-o1;
        }); 6 5 4 3 2 1 */
        //2.方法引用
        Arrays.sort(arr,Functiondemo1::cmp);//6 5 4 3 2 1
        System.out.println(Arrays.toString(arr));
        /*1.被引用的方法必须已经存在
        2.被引用方法的形参和返回值需要和抽象方法一致
        3.被引用方法的功能需满足当前要求。
         */
    }
    public static int cmp(int a,int b){
        return b-a;
    }
}
