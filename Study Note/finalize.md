# finalize

## 一.介绍

### 1.基本作用

`finalize` 方法的主要作用是在垃圾收集器将对象从内存中清除出去之前，执行必要的清理工作 。比如关闭文件流、释放数据库连接、断开网络套接字等非堆内存资源。当垃圾收集器确定某个对象没有被任何引用指向（即成为可回收对象 ）时，会在回收该对象内存前，尝试调用其 `finalize` 方法。

### 2.方法特性

- **调用时机**：垃圾收集器何时调用 `finalize` 方法具有不确定性，由 JVM（Java 虚拟机）决定。不同的 JVM 实现以及系统运行时的各种因素（如内存使用情况、线程调度等 ）都会影响调用时间。并且 JVM 并不保证一定会调用该方法，比如程序异常终止、运行时没有足够资源去执行 `finalize` 等情况，都可能导致方法不被调用。
- **调用次数**：一个对象的 `finalize` 方法最多只会被垃圾收集器调用一次。一旦垃圾收集器调用过该对象的 `finalize` 方法，后续即使该对象再次符合垃圾回收条件，也不会再调用其 `finalize` 方法。
- **运行线程**：运行 `finalize` 方法的线程是未指定的，这意味着开发者无法确切知道该方法在哪个线程中执行，也难以对其执行过程进行精确控制。

### 3.重写要点

- **适用场景**：当类中涉及非堆内存资源（如文件句柄、网络连接、本地方法创建的对象等 ）的管理时，通常需要重写 `finalize` 方法，以确保这些资源在对象被回收时能得到正确释放。
- **注意事项**：重写时要注意避免复杂耗时的操作，因为 `finalize` 方法执行可能会影响垃圾回收的效率，甚至可能导致垃圾回收停顿。同时，应避免在 `finalize` 方法中引发异常，如果重写的 `finalize` 方法抛出异常且未被捕获，可能会导致一些不可预期的后果，如终止相关进程等。



## 二.示例

![image-20250430210423100](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250430210423100.png)

```java
package com.object_;

public class Finalize {
    public static void main(String[] args) {
        Car baoma = new Car("baoma");
        baoma=null;
        //这时baoma就是一个垃圾，垃圾回收器就会回收（销毁）对象，在销毁对象前，会调用该对象的finalize方法
        //我们就可以在finalize中写逻辑代码（比如释放资源：数据库连接或者打开文件。。。）
        //这时就需要重写finalize
        System.gc();//主动调用垃圾回收器

        System.out.println("程序退出了。。。");
    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁汽车"+name);
    }

}
```

