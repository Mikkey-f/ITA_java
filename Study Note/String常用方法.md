# String常用方法

## 一.方法



![](C:\Users\24709\Pictures\Screenshots\屏幕截图 2025-05-12 211504.png)



![image-20250512214028675](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250512214028675.png)

```java
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

```



![image-20250512214221769](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250512214221769.png)



## 二.编程题

### 1.

![image-20250515155721201](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250515155721201.png)

```java
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
```



### 2.

![image-20250515163308133](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250515163308133.png)

```java
public class HomeWork02 {
    public static void main(String[] args) {
        String name = "szj";
        String pwd = "123456";
        String email = "2631725125@qq.com";
        try {
            userRegister(name,pwd,email);
            System.out.println("恭喜你注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userRegister(String name,String pwd,String email){
        int i = name.length();
        if (!(i>=2 && i<=4)){
            throw new RuntimeException("用户名的长度为2，3，4");
        }

        if (!(pwd.length() == 6 && isDigital(pwd))){
            throw new RuntimeException("密码的长度为6，要求全是数字");
        }

        int x = email.indexOf('@');
        int y = email.indexOf('.');
        if (!(x>0 && y>x)){
            throw new RuntimeException("邮箱中包含@和.  并且@在.的前面");
        }

    }

    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
```



### 3.

![image-20250515163520551](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250515163520551.png)

```java
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
```

