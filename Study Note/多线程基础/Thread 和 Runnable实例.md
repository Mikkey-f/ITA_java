# Thread 和 Runnable实例

## 一.多线程执行实例

![](C:\Users\24709\Pictures\Screenshots\屏幕截图 2025-05-25 143035.png)

```java
/**
 * @author 司志俊
 * @version 1.0
 * main线程启动两个子线程
 */
public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();//启动第1个线程
        thread2.start();//启动第2个线程
    }
}

class T1 implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("hello,world" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10){
                break;
            }
        }

    }
}

class T2 implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("hi" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 5){
                break;
            }
        }

    }
}
```





## 二.继承Thread 和 实现Runnable的区别

![image-20250525144609529](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250525144609529.png)

```java
/**
 * @author 司志俊
 * @version 1.0
 * 使用多线程模拟三个窗口同时售票100张
 */
public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        //这里会出现票数超卖
//        sellTicket01.start();//启动售票线程
//        sellTicket02.start();
//        sellTicket03.start();
        //同样会超卖
        SellTicket02 sellTicket02 = new SellTicket02();
        SellTicket02 sellTicket01 = new SellTicket02();
        SellTicket02 sellTicket03 = new SellTicket02();
        new Thread(sellTicket01).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket03).start();

    }
}

//Thread
class SellTicket01 extends Thread{
    private static int ticketNum = 100;//让多个线程共享 ticketNum
    @Override
    public void run() {
        while (true){
            if (ticketNum <= 0){
                System.out.println("售票结束。。。");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票"
            +"剩余票数 " + (--ticketNum));
        }
    }
}

//实现接口的方法
class SellTicket02 implements Runnable{
    private int ticketNum = 100;//让多个线程共享 ticketNum
    @Override
    public void run() {
        while (true){
            if (ticketNum <= 0){
                System.out.println("售票结束。。。");
                break;
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票"
                    +"剩余票数 " + (--ticketNum));
        }
    }
}
```

