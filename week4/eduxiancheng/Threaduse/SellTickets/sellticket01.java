package eduxiancheng.Threaduse.SellTickets;

/**
 * 模拟三个窗口售票100张(使用多线程)
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
        Selltickets02 selltickets01=new Selltickets02();
        Thread thread0=new Thread(selltickets01);
        Thread thread1=new Thread(selltickets01);
        Thread thread2=new Thread(selltickets01);
        thread0.start();;
        thread1.start();
        thread2.start();
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
class Selltickets02 implements Runnable{
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
}