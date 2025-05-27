import java.util.Random;
import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        T t=new T();
        G g=new G(t);
        t.start();
        g.start();
    }
}
class T extends Thread{
    public boolean loop=true;
    @Override
    public void run() {
        while(loop){
            System.out.println((int)(Math.random()*100)+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void setLoop(Boolean flag){
        loop=flag;
    }
}
class G extends Thread{
    public T t;
    public G(T t){
        this.t=t;
    }
    Scanner scanner=new Scanner(System.in);
    @Override
    public void run() {
        while(true){
            char key=scanner.next().charAt(0);
            if(key=='Q'){
                t.setLoop(false);
                System.out.println("方法终止");
                break;
            }
        }
    }
}
