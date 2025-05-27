public class Test01 {
    public static void main(String[] args) {
        B b=new B();
        for(int i=1;i<=10;i++){
            System.out.println("Hi"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i==5){
                System.out.println("主线程中断输出，开始输出子线程");
                b.start();
                try {
                    b.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("子线程输出完毕，主线程继续输出");
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Hello"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
