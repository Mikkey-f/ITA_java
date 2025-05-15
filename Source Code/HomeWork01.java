package string_;

/**
 * @author 司志俊
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        String s = "abcdefgh";
        try {
            s = reverse(s,1,4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(s);
    }
    public static String reverse(String str,int start,int end){
        //对输入的数据进行一个验证
        //编程技巧！！！！
        //写出正确的情况 然后取反
        if(!(str!=null && str.length()>end && end>start && start>=0)){
            throw new RuntimeException("参数不正确");
        }
        char[] charArray = str.toCharArray();
        char c=' ';
        for (int i = start,j=end; i < j; i++,j--) {
            c = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = c;
        }
        //使用charArray[]出现构建一个String
        return new String(charArray);
    }
}
