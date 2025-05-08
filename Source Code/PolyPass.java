package interface_.poly;

//演示多态传递
public class PolyPass {
    public static void main(String[] args) {

        GG g=new Teacher();
        //GG继承了HH接口，而Teacher实现了GG接口
        //相当于Teacher实现了HH接口
        //这就是接口多态传递现象
        HH h=new Teacher();
    }
}
interface HH{}

interface GG extends HH{}

class Teacher implements GG{

}