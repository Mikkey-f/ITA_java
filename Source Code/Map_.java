package map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","sizhijun");
        map.put("no2","fy");
        map.put("no1","szj");//有相同的key值时，会替换value
        map.put("no3","fy");
        map.put(null,null);
        map.put(null,"abc");
        System.out.println("map=" + map);

        //通过get方法，传入key，会返回对应的value
        System.out.println(map.get(null));

    }
}
