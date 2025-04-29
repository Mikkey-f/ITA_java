# This关键字

## 一.介绍

在 Java 里，`this` 是一个关键字，它是对当前对象的引用。借助 `this`，可以在类的方法内部访问该类的实例变量、调用其他方法，还能用于构造函数的重载调用。

## 二.示例

```java
public class day5 {
    public static void main(String[] args) {
        Fish yu = new Fish("caoyu", 11);
        //验证this和yu指向同一个对象
        System.out.println("yu的hashCode="+yu.hashCode());
        //yu的hashCode和this的hashCode相等，说明指向同一个对象
    }

}

class Fish {
    String lei;
    int weight;

    /*    public Fish(String flei,int fw){
            lei=flei;
            weight=fw;
        }*/
    //如果我们的构造器的形参能直接写成属性名就更好了
    //构造器的lei weight是局部变量而不是属性
    //引出this
    public Fish(String lei, int weight) {
        this.lei = lei;
        this.weight = weight;
        System.out.println("this的hashCode="+this.hashCode());
    }
}
```

## 三.对this的理解

![image-20250425153318364](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250425153318364.png)



**小结**：简单地说，哪个对象调用，this就代表哪个对象



## 四.注意事项和使用细节

![](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250425160713636.png)



### 1.this关键字访问属性

```java
class Fish {
    String lei = "sizhijun";
    int weight = 19;

    
    void f3(){
        String lei="fangyao";
        System.out.println("lei="+lei+"\n"+"weight="+weight);//遵从就近原则输出的lei为“fangyao”
        System.out.println("lei="+this.lei+"\n"+"weight="+this.weight);//只会输出属性lei；“sizhijun”，
                                                                       //不管有无局部lei
    }
}
```



### 3.访问成员方法

```java
public class day5 {
    public static void main(String[] args) {
        Fish yu = new Fish();
        yu.f2();
    }
}

class Fish {
    void f1(){
      System.out.println("f1被调用");
    }
    void f2(){
        System.out.println("f2被调用");
        //想在f2中调用f1，两种办法
        f1();
        this.f1();
    }

}
```

### 4.访问构造器语法

```java
public class day6 {
    public static void main(String[] args) {
        T t= new T();
    }
}
class T{
    String name ;
    int age;
    //使用this实现在一个构造器中使用另一个构造器
    public T(){
        this("sizhijun",19);
        //细节：使用this时this("sizhijun",19);语句必须放在第一句，否则会报错
        //且只能在构造器中使用
        System.out.println("构造器T（）被调用");
    }
    public T(String s,int a){
        System.out.println("构造器T（String s,int a）被调用");
    }
}
```

## 五.练习

![image-20250425171714656](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250425171714656.png)

```java
public class day6 {
    public static void main(String[] args) {
        T t1= new T("sizhijun",19);
        T t2= new T("fangyao",17);
        System.out.println(t1.compare(t2));
    }
}
class T{
    String name ;
    int age;
    public T(String name,int age){
        this.name=name;
        this.age=age;
    }
    boolean compare(T a){
        if(this.name==a.name&&this.age==a.age){
            return true;
        }else{
            return false;
        }
    }
}
```

