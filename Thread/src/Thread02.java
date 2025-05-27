public class Thread02 {
    public static void main(String[] args) {
        Tiger tiger=new Tiger();
        ThreadProxy threadProxy=new ThreadProxy(tiger);
        threadProxy.start();
    }
}
class Animal{

}
class Tiger extends Animal implements Runnable{
    public void run(){
        System.out.println("老虎嗷嗷叫~~~");
    }
}
//静态代理模式
class ThreadProxy implements Runnable{
    private Runnable target=null;
    public void run(){
        if(target!=null){
            target.run();
        }
    }
    public ThreadProxy(Runnable target){
        this.target=target;
    }
    public void start(){
        start0();
    }
    public void start0(){
        if(target!=null)
            run();
    }
}