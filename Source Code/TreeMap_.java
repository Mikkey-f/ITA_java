package map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author 司志俊
 * @version 1.0
 */
public class TreeMap_ {
    public static void main(String[] args) {
        //默认构造器,无序
        //TreeMap treeMap = new TreeMap();

        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //要求字符串大小排序
                //return ((String)o1).compareTo((String) o2);

                //按照字符串长度排序
                return ((String) o1).length() - ((String) o2).length();

            }
        });
        treeMap.put("szj","fy");
        treeMap.put("zh","xn");
        treeMap.put("a","b");
        System.out.println("treeMap="+treeMap);
    }
}
