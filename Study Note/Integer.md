# Integer

## 一.Integer创建机制

![image-20250512152543987](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250512152543987.png)

```java

//1. 如果i 在 IntegerCache.low(-128)~IntegerCache.high(127),就直接从数组返回
//2. 如果不在 -128~127,就直接 new Integer(i)
//源码：
public static Integer valueOf(int i) {
    if (i >= IntegerCache.low && i <= IntegerCache.high)
        return IntegerCache.cache[i + (-IntegerCache.low)];
    return new Integer(i);
}
//valueOf方法中已经创建了一个数组，范围在-128~127，如果传入的数字在这个范围内，直接将数组中的数取出
//不在就 new 一个新对象
```



![](C:\Users\24709\Pictures\Screenshots\屏幕截图 2025-05-12 151618.png)





## 二.面试题

![](C:\Users\24709\Pictures\Screenshots\屏幕截图 2025-05-12 152214.png)