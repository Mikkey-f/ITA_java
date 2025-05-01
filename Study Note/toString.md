# toString

## 一.介绍

### 1.方法定义与默认实现

- **定义**：`public String toString()` ，该方法无参数，返回值类型为 `String` ，作用是返回对象的字符串表示形式。
- **默认实现**：`Object` 类中 `toString` 方法的默认实现是返回一个字符串，内容为 `getClass().getName()类的全类名（包名+类名） + '@' + Integer.toHexString(hashCode()) 将对象的hashCode值转成16进制` ，即类的全限定名加上 `@` 符号，再加上对象哈希码的无符号十六进制表示。比如自定义类 `Person` 的对象，默认 `toString` 可能返回类似 `com.example.Person@123abc` 的内容。这种默认表示形式对了解对象基本信息有一定帮助，但实际开发中往往不够直观和有用。

![image-20250430173639935](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250430173639935.png)



### 2.源码

```java
public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
```

## 二.示例

![](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250430203721294.png)

```java
package com.object_;

public class ToString {
    public static void main(String[] args) {
        Monster monster = new Monster("小妖怪", "巡山", 1100);
        System.out.println(monster.toString()+"  hashcode="+monster.hashCode());
        //输出com.object_.Monster@23fc625e  hashcode=603742814
        
        System.out.println(monster);//toString方法会被默认调用
        //等价于System.out.println(monster.toString());
        //输出Monster{name='小妖怪', job='巡山', sal=1100.0}
    }
}
class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }
    //重写toString方法，输出对象的属性

    @Override
    public String toString() {//重写toString方法
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}

```

