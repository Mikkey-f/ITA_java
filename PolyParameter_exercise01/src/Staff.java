public class Staff extends Employee{
    public Staff(String name,double salary){
        super(name, salary);
    }
    public void work(){
        System.out.println("普通员工自己的工作方法");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
