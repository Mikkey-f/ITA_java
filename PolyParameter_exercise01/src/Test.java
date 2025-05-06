public class Test {
    public static void main(String[] args){
        Manager manager=new Manager("刘经理",10000,10000);
        Staff staff=new Staff("小李",9000);
        showEmpAnual(manager);
        testWork(manager);
        showEmpAnual(staff);
        testWork(staff);
    }
    public static void showEmpAnual(Employee e){
        System.out.println(e.getAnnual());//动态绑定
    }
    public static void testWork(Employee e){
        if(e instanceof Manager)
            ((Manager)e).manage();
        if(e instanceof Staff)
            ((Staff)e).work();
    }
}
