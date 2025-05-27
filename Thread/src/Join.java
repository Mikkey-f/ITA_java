public class Join {
    public static void main(String[] args) {
        A a=new A();
        a.start();
        for(int i=1;i<=10;i++){
            System.out.println("主线程吃包子...."+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i==5){
                System.out.println("主线程不吃了，让子线程先吃");
                try {
                    Thread.yield();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                System.out.println("子线程吃完了，主线程继续吃");
            }
        }
    }
}
class A extends Thread{
    public void run(){
        for(int i=1;i<=20;i++){
            System.out.println("子线程吃包子..."+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}