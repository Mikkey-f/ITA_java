package java1;

public class child extends father{
    private int age;
    public child(int money,String pro,String job,int age){
        super(money, pro, job);
        this.age=age;
    }
    public child(){};
    public void show(){
        System.out.println(getMoney()+" "+getJob()+" "+getPro()+" "+this.age);
    }
}
