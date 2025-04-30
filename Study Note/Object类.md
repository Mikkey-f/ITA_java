# Object类

## 一.equals

### 1.==

![image-20250429202743222](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250429202743222.png)

```java
package com.object_.equals;

public class e1 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = a;
        System.out.println(b == c);//true
        B bobj = a;//这里进行了向上转型。由于 A 是 B 的子类，把 A 类型的对象赋值给 B 类型的引用变量是可行的，
        // 因为子类对象能够被看作是其父类对象。
        System.out.println(bobj == c);//true
        A aobj = bobj;//错误
        //此处是向下转型。向下转型需要显式类型转换，并且要保证引用变量实际指向的对象类型是目标类型或者其子类型。
        // bobj 是 B 类型的引用变量，虽然它指向的是 A 类型的对象，但编译器仅知道它是 B 类型，
        // 所以不能直接把 B 类型的引用变量赋值给 A 类型的引用变量，必须进行显式类型转换。
        System.out.println(aobj == a);
    }
}

class A extends B {}

class B {}
```

![image-20250429213615259](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250429213615259.png)



### 2.