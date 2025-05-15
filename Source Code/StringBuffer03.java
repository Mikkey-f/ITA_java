package StringBuffer_;

/**
 * @author 司志俊
 * @version 1.0
 */
public class StringBuffer03 {
    public static void main(String[] args) {
        //String -->StringBuffer
        //1.使用构造器
        String s = "hello tom";
        //返回StringBuffer对象，对s没有影响
        StringBuffer stringBuffer = new StringBuffer(s);
        //2.使用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(s);

        //StringBuffer-->String
        StringBuffer stringBuffer2 = new StringBuffer("sizhijun");
        //1.使用StringBuffer提供的 toString方法
        String s1 = stringBuffer2.toString();
        //2，使用构造器
        String s2 = new String(stringBuffer2);
    }
}
