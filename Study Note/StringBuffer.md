# StringBuffer

## 一.结构剖析

### 1.介绍

![image-20250513154231327](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250513154231327.png)



### 2.比较

![image-20250513154438041](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250513154438041.png)



![image-20250513155207128](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250513155207128.png)



```java
public class StringBuffer01 {
    public static void main(String[] args) {

        //1. StringBuffer 的直接父类 是 AbstractStringBuilder
        //2. StringBuffer 实现了 Serializable，即StringBuffer的对象可以串行化
        //3. 在父类 AbstractStringBuilder 中有属性 char[] value,不是final
        // 该 value 数组存放 字符串内容，引出存放在堆中的
        //4. StringBuffer 是一个 final类，不能被继承
        //5. 因为StringBuffer 字符内容是存在 char[] value, 所以在变化(增加/删除)时
        // 不用每次都更换地址(即不是每次创建新对象)，所以效率高于 String
        
        StringBuffer stringBuffer = new StringBuffer("hello");

    }
}
```



## 二.转换

![image-20250513160408476](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250513160408476.png)



```java
public class StringBuffer02 {
    public static void main(String[] args) {
        //1.创建一个大小为16的 char[]，用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();
        //2.通过构造器指定 char[] 的大小
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //3.通过给一个String 创建 StringBuffer
        StringBuffer stringBuffer2 = new StringBuffer("hello");
    }
}
```



![image-20250513161511497](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250513161511497.png)

```java
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

```



## 三.常用方法

### 1.

![image-20250513165555059](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250513165555059.png)



```java
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
```



### 2.测试题

![image-20250513192150385](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250513192150385.png)



![image-20250513193617352](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250513193617352.png)

```java
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String price = "";
        price = scanner.next();
        StringBuffer stringBuffer = new StringBuffer(price);
        int i = stringBuffer.lastIndexOf(".");
        for (int j = i - 3; j > 0; j-=3) {
            stringBuffer = stringBuffer.insert(j,",");
        }
        System.out.println(stringBuffer);
    }
}
```

