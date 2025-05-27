public class Thread03 {
    public static void main(String[] args) {
        T1 t1=new T1();
        T2 t2=new T2();
        //t1.run();
        Thread thread1=new Thread(t1);
        Thread thread2=new Thread(t2);
        thread1.start();
        thread2.start();
        thread1.run();
    }
}
class T1 extends Thread{
    int count=0;
    public void run(){
        while(true){
            System.out.println("Hello World!"+" "+(++count)+" "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(count==30)
                break;
        }
    }
}
class T2 implements Runnable{
    int count=0;
    public void run(){
        while(true){
            System.out.println("我嘞个豆!"+" "+(++count)+" "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(count==30)
                break;
        }
    }
}
