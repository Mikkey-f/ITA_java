package enum_;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season02.SPRING);
        System.out.println(Season02.SUMMER);
    }
}

//演示使用enum关键字来实现枚举
enum Season02{
    //定义了两个固定对象
    //public final static Season01 SPRING = new Season01("春天","warm");
    //public final static Season01 SUMMER = new Season01("夏天","hot");

    //如果使用enum 来实现枚举类
    //1.使用关键字enum替代 class
    //2.public final static Season01 SPRING = new Season01("春天","warm") 直接使用
    //  SPRING("春天","warm");  常量名(实参列表)
    //3.如果有多个对象，使用,号间隔
    //4.如果使用enum 来实现枚举，要求将定义的常量对象写在最前面

    SPRING("春天","warm"),
    SUMMER("夏天","hot"),
    SHILI();//也可以写为SHILI;
    private String name;
    private String desc;//描述

    private Season02(){//无参构造器

    }
    private Season02(String name, String desc) {
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