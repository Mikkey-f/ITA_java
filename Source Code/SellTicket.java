package syn;

/**
 * @author 司志俊
 * @version 1.0
 */
public class SellTicket {
    public static void main(String[] args) {
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();//线程1
        new Thread(sellTicket02).start();//线程2
        new Thread(sellTicket02).start();//线程3

    }
}

//实现接口的方法,使用synchronized实现线程同步
class SellTicket02 implements Runnable{
    private int ticketNum = 100;//让多个线程共享 ticketNum
    private boolean loop = true;
    Object object = new Object();

    //同步方法（静态的）的锁为当前类本身
    //public synchronized static void m1(){} 的锁加在 SellTicket02.class
    //如果在静态方法中，实现一个同步代码块
    /*
        synchronized (SellTicket02.class) {
            System.out.println("m2");
        }
     */
    public synchronized static void m1(){

    }
    public static void m2(){
        synchronized (SellTicket02.class) {//不能用this
            System.out.println("m2");
        }
    }
    //public synchronized void sell(){} 就是一个同步方法
    //这时锁在 this对象上
    //也可以在代码块上写 synchronized同步代码块，互斥锁还是在this对象
    public /*synchronized*/ void sell(){//同步方法，在同一时刻，只能有一个线程执行sell方法

        synchronized (/*this*/object) {//任意一个对象都行，只要保证多个线程使用同一个对象的锁
            if (ticketNum <= 0) {
                System.out.println("售票结束。。。");
                loop = false;
                return;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票"
                    + "剩余票数 " + (--ticketNum));
        }
    }
    @Override
    public synchronized void run() {
        while (loop) {
            sell();
        }
    }
}
