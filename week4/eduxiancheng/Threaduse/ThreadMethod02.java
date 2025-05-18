package eduxiancheng.Threaduse;

/**
 * 常用方法第二组:  1.yield:线程的礼让.让出cpu,让其他线程执行,但礼让时间不确定,也不一定能礼让成功
 *               2.join:线程的插队.插队的线程一旦插队成功,则先完成插入的线程的所有任务
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T1 t = new T1();
        t.start();
        for(int i=1;i<=20;i++){
            System.out.println("hi"+i);
            Thread.sleep(1000);
            if(i==5){
                t.join();//相当于让t线程先执行完毕,再执行主线程
                //Thread.yield();礼让,不一定成功.
            }
        }
        System.out.println("主线程结束");

    }
}
class T1 extends Thread{
    @Override
    public void run() {
        int cnt=0;
        while (true){
            System.out.println("hello"+(++cnt));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(cnt==20) {
                System.out.println("子线程结束");
                break;
            }
        }
    }
}