package com.poly.parameter;

public class Test {
    public static void main(String[] args) {

        Worker tom = new Worker("tom",2500);
        Manager milan = new Manager("milan", 5000,200000);
        Test a= new Test();
        a.showEmpAnnual(tom);
        a.showEmpAnnual(milan);
        a.testWork(tom);
        a.testWork(milan);
    }

    public void showEmpAnnual(Employee a){
        System.out.println(a.getAnnual());
    }

    public void testWork(Employee e){
        if (e instanceof Manager){
            ((Manager) e).manage();
        }else if(e instanceof Worker){
            ((Worker) e).work();
        }
    }
}
