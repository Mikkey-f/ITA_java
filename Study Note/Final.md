# Final

## 一.介绍

在 Java 里，`final` 是一个用途广泛的关键字，可用于修饰类、方法以及变量。

### 1.修饰类

当用 `final` 修饰一个类时，意味着这个类不能被继承，也就是该类不能有子类。这种方式常用于确保类的行为和状态不会被修改。

### 2.修饰方法

使用 `final` 修饰方法时，表示该方法不能被子类重写（覆盖）。

### 3.修饰变量

`final` 修饰变量时，变量一旦被赋值，其值就不能再被改变，相当于常量。`final` 变量的使用场景较为多样，可分为成员变量、局部变量和参数。

#### 4.局部变量

局部变量使用 `final` 修饰时，在第一次赋值后就不能再改变。

#### 5.参数

当方法参数被 `final` 修饰时，在方法内部不能对该参数进行重新赋值。

![image-20250507173436385](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250507173436385.png)





## 二.细节

![image-20250507192919179](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250507192919179.png)

```java
package final_.dt;

public class dt1 {
    public static void main(String[] args) {

    }
}
class A{
    public final double TAX_RATE=0.08;//定义时赋值
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public A() {//构造器赋值
    TAX_RATE2=0.01;
    }
    {//代码块赋值
        TAX_RATE3=0.2;
    }
}
class BB{
    public static final double TAX_RATE=0.08;
    public static final double TAX_RATE2;
    static {
        TAX_RATE2=12;
    }
}
```



![image-20250507193027495](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250507193027495.png)



**对第7点的详细解释：**

```java
package final_.dt;

public class dt02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
    }
}
class BBB{
    public  static int num=10000;
    static {
        System.out.println("静态代码块被执行");
    }
}
final class AAA{
    public void cry(){}
}
//当我们没有在num前加上final修饰时，main函数中输出num时会导致BBB类被加载
//输出
静态代码块被执行
10000
    
//如果只想使用num这个属性，不想类被加载，如下在num前加上final，此时BBB类就不会被加载（java底层的优化）
package final_.dt;

public class dt02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
    }
}
class BBB{
    public  final static int num=10000;
    static {
        System.out.println("静态代码块被执行");
    }
}
final class AAA{
    public void cry(){}
}
```

//输出10000