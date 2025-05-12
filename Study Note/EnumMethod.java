package enum_;

/**
 * @author 司志俊
 * @version 1.0
 * 演示enum的各种方法
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season03 spring = Season03.SPRING;
        System.out.println(spring.name());
        //ordinal()输出的是该枚举对象的次序/编号，从0开始
        System.out.println(spring.ordinal());//0
        //values方法，返回Season3[]
        //含有定义的所有枚举对象
        Season03[] values = Season03.values();

        for(Season03 season0: values){//增强for循环
            System.out.println(season0);
        }
//        int[] nums = {1,2,9};
//        //普通for循环
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        System.out.println("===================");
//        //增强for循环
//        for (int i : nums) {//依次从nums数组中取出数据，赋给i，取完就退出
//            System.out.println("i=" + i);
//        }

        Season03 s = Season03.valueOf("SPRING");
        System.out.println(s);

        System.out.println(Season03.SPRING.compareTo(Season03.SUMMER));
    }
}
enum Season03{

    SPRING("春天","warm"),
    SUMMER("夏天","hot");
    private String name;
    private String desc;//描述

    private Season03(){//无参构造器

    }
    private Season03(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season01{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}