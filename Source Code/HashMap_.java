package map_;

import java.util.HashMap;

/**
 * @author 司志俊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashMap_ {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("java", 10);
        hashMap.put("szj", 20);
        hashMap.put("fy", 17);//替换

        System.out.println("hashMap=" + hashMap);

        //解读HashMap源码
        //1.执行构造器 new HashMap();
        //  初始化加载因子 loadfactor = 0.75
        //  HashMap$Node[] table = null;
        //2.执行put
        /*
        public V put(K key, V value) {k = "java" v=10
            return putVal(hash(key), key, value, false, true);
        }
        */
    }
}
