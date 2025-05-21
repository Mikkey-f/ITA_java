//public class CustomGenericsInterface {
//    public static void main(String[] args) {
//
//    }
//}
//interface Iusb<U,R>{
//    int i=10;
//    R get(U u);
//    void hi(R r);
//    void run(R r1,R r2,U u1,U u2);
//
//}
//class BB implements Iusb{
//
//    @Override
//    public Object get(Object o) {
//        return null;
//    }
//
//    @Override
//    public void hi(Object o) {
//
//    }
//
//    @Override
//    public void run(Object r1, Object r2, Object u1, Object u2) {
//
//    }
//}
//class CC implements Iusb<String,Float>{
//
//    @Override
//    public Float get(String s) {
//        return null;
//    }
//
//    @Override
//    public void hi(Float aFloat) {
//
//    }
//
//    @Override
//    public void run(Float r1, Float r2, String u1, String u2) {
//
//    }
//}
//interface IA extends Iusb<String,Double>{
//
//}
//class AA implements IA{
//
//    @Override
//    public Double get(String s) {
//        return null;
//    }
//
//    @Override
//    public void hi(Double aDouble) {
//
//    }
//
//    @Override
//    public void run(Double r1, Double r2, String u1, String u2) {
//
//    }
//}