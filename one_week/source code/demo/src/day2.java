public class day2 {
    public static void main(String[] args) {
        Ss a=new Ss();
        int[] res=a.ss(100,290);
        System.out.println("和等于"+res[0]+"\n"+"差等于"+res[1]);
        a.t();
        int[] aa={1,2,3,4};
        Ff t=new Ff();
        t.b(aa);
        for(int i=0;i<=3;i++){
            System.out.println("\t" + aa[i]);
        }
    }
}
//一个方法只有一个返回值，但使用数组可以返回多个结果
class Ss{
    int[] ss(int n1,int n2){
        int[] ans=new int[2];
        ans[0]=n1+n2;
        ans[1]=n1-n2;
        return ans;
    }
    void print(int n){
        System.out.println("输入的数字为"+n);
    }
    void so(){
        print(100);
        System.out.println("继续执行so");
    }
    void t(){
        System.out.println("执行a的t");
        Ff n=new Ff();
        n.a();
        System.out.println("继续执行a的t");
    }
}
class Ff{
    public void a(){
        System.out.println("Ff的方法a被执行");
    }
    void b(int[] a){
        a[0]=99;
    }
}