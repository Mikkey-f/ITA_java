package map_;

import java.util.Properties;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("szj",20);
        properties.put("fy",17);
        properties.put("jack",18);
        System.out.println("properties="+properties);

        //如何通过key获得对应值
        System.out.println(properties.get("szj"));
    }
}
