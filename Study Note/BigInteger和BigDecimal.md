# BigInteger和BigDecimal

## 一.BigInteger

![image-20250515103230395](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250515103230395.png)

![image-20250515103002887](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250515103002887.png)





## 二.BigDecimal

![image-20250515104942678](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250515104942678.png)

```java
public class BigDecimal_ {
    public static void main(String[] args) {
        double d = 122.671674618946191141;
        System.out.println(d);
        BigDecimal bigDecimal = new BigDecimal("122.671674618946191142");
        BigDecimal bigDecimal1 = new BigDecimal("1.3");
        System.out.println(bigDecimal);

        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));//可能抛出异常（除不尽）
        System.out.println(bigDecimal.multiply(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));

    }

}
```

