package eduxiancheng.ThreadPractice;

public class ThreadPractice2 {
    public static void main(String[] args) {
        user user = new user();
        new Thread(user).start();
        new Thread(user).start();
    }
}
//用Runnable原因:1.因为这里涉及到多个线程共享资源,所以用Runnable
class user implements Runnable{
    private int money=10000;
    boolean loop=true;
    public void take(){
        synchronized (this){
            if(money<1000){
                System.out.println("余额不足了,不能取款了");
                loop=false;
                return;
            }
            else {
                money-=1000;
                System.out.println(Thread.currentThread().getName()+"取走了1000块"+"还剩:"+money);
            }
        }
    }
    @Override
    public void run() {
        while(loop){
            //take();
            synchronized (this){ //哪个线程争夺到了this对象的锁，就执行该代码块，执行后会释放this对象锁
                                 //争夺不到的线程就阻塞，准备继续争夺，已经争夺到并且执行完的线程可以继续争夺
                if(money<1000){
                    System.out.println("余额不足");
                    break;
                }
                else{
                    money-=1000;
                    System.out.println(Thread.currentThread().getName()+"取出了1000,当前的余额为:"+money);
                }
            }
        }

    }
}