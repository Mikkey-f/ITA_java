package string_.StringMethod;

/**
 * @author 司志俊
 * @version 1.0
 */
public class StringMethod01 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));

        String usename = "jOhn";
        if ("john".equalsIgnoreCase(usename)){//不分大小写判断内容是否相等
            System.out.println("Success");
        }else {
            System.out.println("Failure");
        }

        System.out.println(usename.length());

        String s1 = "skdjhwugdsc&%$#";
        int index = s1.indexOf('g');//第一次出现的索引，找不到返回-1
        int index1 = s1.indexOf("wu");
        System.out.println("wu="+index1);

        index = s1.lastIndexOf('&');//最后一次出现的索引
        index1 = s1.lastIndexOf("%$");
        System.out.println("%$=" +index1);

        String name = "sizhijunhefangyao";
        System.out.println(name.substring(7));//截取索引7后面的所有字符
        System.out.println(name.substring(0,9));//从索引0开始截取9个字符
    }
}
