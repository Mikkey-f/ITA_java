package wrapper;

/**
 * @author 司志俊
 * @version 1.0
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类（integer）->String
        Integer i = 100;//自动装箱
        //1.
        String str1 = i + "";
        //2.
        String str2 = i.toString();
        //3.
        String str3 = String.valueOf(i);

        //String -> 包装类
        String str4 = "1234";
        int i1 = Integer.parseInt(str4);//使用到自动装箱
        //Integer i2 = new Integer(str4);//构造器，该方法已弃用

    }
}
