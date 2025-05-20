package eduxiancheng.Threaduse;

/**
 * 模拟三个窗口售票100张(使用多线程)
 */

//线程同步机制:在多线程编程时，一些数据不允许多个线程同时访问，保证数据在任何同一时刻，最多有一个线程访问
    //以保证数据的完整性

/**
 *  ----------------------互斥锁-------------------------------------
 *  1.每个对象都对应一个可称为互斥锁的标记,这个标记用来保证在任一时刻，只能有一个线程访问对象
 *  2.关键字synchronized来与对象的互斥锁联系。当某个对象用synchronized修饰时，表明该对象在任一时刻只能由一个线程访问
 *  3.同步的局限性:导致程序的执行效率降低。
 *  4.同步方法(非静态的)的锁可以是this,也可以是其他对象（要求是同一个对象）******
 *  5.同步方法（静态的）的锁为当前类本身.
 *  6.用Thread由于会创建多个对象，所以不行
 */
public class sellticket01 {
    public static void main(String[] args) {
       /*Selltickets01 selltickets01=new Selltickets01();
       Selltickets01 selltickets2=new Selltickets01();
       Selltickets01 selltickets3=new Selltickets01();
        //会出现超卖,原因:三个线程可能同时执行相同代码,但是--num的操作还没开始
       selltickets01.start();
       selltickets2.start();
       selltickets3.start();*/

        //2.利用Runnable接口---->仍然超卖
       /* Selltickets02 selltickets01=new Selltickets02();
        Thread thread0=new Thread(selltickets01);
        Thread thread1=new Thread(selltickets01);
        Thread thread2=new Thread(selltickets01);
        thread0.start();;
        thread1.start();
        thread2.start();*/

        //3.
        Selltickets03 selltickets03 = new Selltickets03();
        new Thread(selltickets03).start();
        new Thread(selltickets03).start();
        new Thread(selltickets03).start();
    }
}
//说明:
//1.public synchronized void sell() 就是一个同步方法
//2.这时所在this对象--->该程序中即为  selltickets03。
//3.也可以在代码块上写synchronized，同步代码块，互斥锁还是在this对象
class Selltickets03 implements Runnable{//同步方法，同一时刻，只能有一个线程执行sell方法
    private  int num=100;//多个线程共享
    private boolean loop=true;
    Object object=new Object();//由于是同一对象创建的，所以也不会超卖

    //同步方法（静态的）
    //1.public synchronized static void m1(){//锁是加在Selltickets03,class这个对象上
    public synchronized static void m1(){//锁是加在Selltickets03,class这个对象上

    }
    public static void m2(){
        synchronized (/*this:会报错*/Selltickets03.class){
            System.out.println("114514");
        }
    }
    public /*synchronized*/ void sell(){
        synchronized (/*object*/this){
            if (num<=0){
                System.out.println("售票结束!");
                loop=false;
                return;
            }
            //休眠
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口 "+Thread.currentThread().getName()+" 卖出了一张票"+",剩余"+(--num)+"张票");
        }
    }
    @Override
    public  void run() {//同步方法,在同一时刻,只能有一个线程执行run方法
        while (loop){
            sell();
        }
    }
}
//方法1:使用Thread
/*class Selltickets01 extends Thread{
    private static int num=100;//多个线程共享
    @Override
    public void run() {
        while (true){
            if (num<=0){<-------三个线程可能同时进来
                System.out.println("售票结束!");
                break;
            }
            //休眠
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口 "+Thread.currentThread().getName()+" 卖出了一张票"+",剩余"+(--num)+"张票");
        }
    }
}*/
//2.实现Runnable接口的方式
/*class Selltickets02 implements Runnable{
    private  int num=100;//多个线程共享
    @Override
    public void run() {
        while (true){
            if (num<=0){
                System.out.println("售票结束!");
                break;
            }
            //休眠
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口 "+Thread.currentThread().getName()+" 卖出了一张票"+",剩余"+(--num)+"张票");
        }
    }
}*/