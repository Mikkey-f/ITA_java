//public class States {
//    public static void main(String[] args) {
//        T t=new T();
//        t.setName("子线程");
//        System.out.println(t.getName()+"状态"+t.getState());
//        t.start();
//        while(t.getState()!=Thread.State.TERMINATED){
//            System.out.println(t.getName()+"状态"+t.getState());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println(t.getState());
//    }
//}
//class T extends Thread{
//    @Override
//    public void run(){
//        for(int i=1;i<=10;i++){
//            System.out.println("hi"+i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}