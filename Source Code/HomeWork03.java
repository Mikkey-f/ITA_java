package string_;

/**
 * @author 司志俊
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        String s = "si zhi jun";
        printName(s);



    }
    public static void printName(String str){
        if (str == null){
            System.out.println("数组不能为空");
            return;
        }

        String[] names = str.split(" ");
        if (names.length != 3){
            System.out.println("输入的字符串格式不对");
            return;
        }
        String format = String.format("%s,%s,%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);

    }
}
