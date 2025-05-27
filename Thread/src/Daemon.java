public class Daemon {
    public static void main(String[] args) {
        C c=new C();
        c.setDaemon(true);
        c.start();
        for(int i=1;i<=5;i++){
            System.out.println("go学长在搜点"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class C extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("瓦学弟在打瓦"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}