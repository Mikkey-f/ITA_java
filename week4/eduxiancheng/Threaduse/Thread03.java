package eduxiancheng.Threaduse;

/**
 * 多个子线程案例
 * main方法启动两个子线程
 */
public class Thread03 {
    public static void main(String[] args) {
        person1 prs1=new person1();
        person2 prs2=new person2();
        Thread thread1=new Thread(prs1);
        Thread thread2=new Thread(prs2);
        thread1.start();
        thread2.start();
    }
}
class person1 implements Runnable{

    @Override
    public void run() {
        int num1=0;
        while (true){
            System.out.println("hello!"+Thread.currentThread().getName());
            ++num1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(num1==10){
                break;
            }
        }
    }
}
class person2 implements Runnable{

    @Override
    public void run() {
        int num2=0;
        while (true){
            System.out.println("Hi"+Thread.currentThread().getName());
            ++num2;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(num2==5){
                break;
            }
        }
    }
}