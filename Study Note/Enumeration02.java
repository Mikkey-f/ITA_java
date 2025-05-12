package enum_;

import java.security.PublicKey;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season01.SPRING);
        System.out.println(Season01.SUMMER);
    }
}
//演示自定义枚举实现
class Season01{
    private String name;
    private String desc;//描述

    //定义了两个固定对象
    public final static Season01 SPRING = new Season01("春天","warm");
    public final static Season01 SUMMER = new Season01("夏天","hot");
    //1.将构造器私有化
    //2.去掉set方法，防止属性被修改
    //3.在Season内部，直接创建固定的对象
    //4.可以加入final修饰符
    private Season01(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season01{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}