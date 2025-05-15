package StringBuffer_;

/**
 * @author  司志俊
 * @version 1.0
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");

        stringBuffer.append(',');
        stringBuffer.append("zhnag");
        stringBuffer.append("si").append(10.1).append(true);
        System.out.println(stringBuffer.toString());

        stringBuffer.delete(11,14);//删除11~14的字符 [11,14) 不包含14
        System.out.println(stringBuffer);

        //用 fangyao 替换 11~14 的字符 [11,14)
        stringBuffer.replace(11,14,"fangyao");
        System.out.println(stringBuffer);

        //查找指定的子串在字符串第一次出现的索引，如果找不到返回-1
        int indexOf = stringBuffer.indexOf("fangyao");
        System.out.println(indexOf);

        //在索引为11的位置插入"sizhijun",原来索引为9的内容自动后移
        stringBuffer.insert(11,"sizhijun");
        System.out.println(stringBuffer);
    }
}
