package eduxiancheng.Threaduse;

public class DeadLock1 {
    public static void main(String[] args) {
        Deadlock a = new Deadlock(true);
        a.setName("a线程");
        Deadlock b = new Deadlock(false);
        b.setName("b线程");
        a.start();
        b.start();

    }
}
class Deadlock extends Thread{
    //静态方法,指向同一对象
    static Object o1=new Object();
    static Object o2=new Object();
    boolean flag;

    public Deadlock(boolean flag) {
        this.flag = flag;
    }

    //1.如果flag为T,线程就会先得到/持有o1对象锁
    //如果线程A得不到o2对象锁,就会Blocked
    //3.如果flag为F,线程B先得到o2对象锁,然后尝试获取o1的对象锁,如果线程B得不到o1对象锁,就会Blocked
    @Override
    public void run() {
        if(flag){
            synchronized (o1) {//对象互斥锁
                System.out.println(Thread.currentThread().getName() + "进入1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        }
        else{
            synchronized (o2) {

                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}