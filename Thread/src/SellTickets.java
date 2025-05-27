public class SellTickets {
    public static void main(String[] args) {
        SellTicket03 sellTicket03=new SellTicket03();
        Thread thread1=new Thread(sellTicket03);
        Thread thread2=new Thread(sellTicket03);
        Thread thread3=new Thread(sellTicket03);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class SellTicket03 implements Runnable{
    public int count=100;
    boolean loop=true;
    public synchronized void sell(){
        if(count<=0) {
            System.out.println("售票结束");
            loop=false;
        }
        if (!loop || count <= 0) return;//第一层检查
        System.out.println(Thread.currentThread()+"窗口售出一张票"+",还剩"+(--count)+"张票");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public  void run(){
        while(loop){
            sell();//卖一张
        }
    }

}

