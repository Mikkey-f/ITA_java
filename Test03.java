public class Test03 {
    public static void main(String[] args) {
        CellPhone cellPhone=new CellPhone();
        cellPhone.testWork(new ICalculate(){
            public double work(double n1,double n2){
                return n1+n2;
            }
        },9,10);
        cellPhone.testWork(new ICalculate(){
            public double work(double n1,double n2){
                return n1*n2;
            }
        },13.58,5);
    }
}
interface ICalculate{
    public abstract double work(double n1,double n2);
}
class CellPhone{
    public void testWork(ICalculate iCalculate,double n1,double n2){
        double res=iCalculate.work(n1,n2);
        System.out.println("结果为："+res);
    }
}