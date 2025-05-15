package System_;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 司志俊
 * @version 1.0
 */
public class System_ff {
    public static void main(String[] args) {
        System.out.println("ok1");
        //System.exit(0);
        //0表示一个正常的状态
        System.out.println("ok2");

        int[] src = {1, 2, 3};
        int[] dest = new int[3];

        //1. 主要是搞清楚这五个参数的含义
//2.
//  源数组
//  * @param    src      the source array.
//  srcPos: 从源数组的哪个索引位置开始拷贝
//  * @param    srcPos  starting position in the source array.
//  dest : 目标数组，即把源数组的数据拷贝到哪个数组
//  * @param    dest     the destination array.
//  destPos: 把源数组的数据拷贝到 目标数组的哪个索引
//  * @param    destPos  starting position in the destination data.
//  length: 从源数组拷贝多少个数据到目标数组
//  * @param    length   the number of array elements to be copied.
        System.arraycopy(src,0,dest,1,2);
        System.out.println("dest = "+ Arrays.toString(dest));

        System.out.println(System.currentTimeMillis());
    }
}
