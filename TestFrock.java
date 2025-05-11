public class TestFrock {
    public static void main(String[] args) {
        Frock[] frocks=new Frock[3];
        frocks[0]=new Frock();
        frocks[1]=new Frock();
        frocks[2]=new Frock();
        for(Frock frock:frocks){
            System.out.println(frock.getSerialNumber());
        }
    }
}
class Frock {
    private static int currentNum=100000;
    private int serialNumber;
    public Frock(){
        serialNumber=getNextNum();
    }
    public static int getNextNum(){
        currentNum+=100;
        return currentNum;
    }
    public int getSerialNumber() {
        return serialNumber;
    }

}
