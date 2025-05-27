public class Thread01 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Thread thread=new Thread(dog);
        thread.start();
    }
}
class Dog implements Runnable{
    public void run(){
        int count=0;
        while(true){
            System.out.println("小狗汪汪叫..."+(++count)+" "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);//延时
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(count==10)
                break;
        }
    }
}

