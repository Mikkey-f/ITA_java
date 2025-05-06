package com.ljw.study;

public class Mouster {
    private String name;
    private String job;
    private double salary;

    public Mouster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
//    public String toString(){
//        return name+"在"+job+"，每个月两千";
//    }

    @Override
    //重写toString方法，打印对象或拼接对象属性
    public String toString() {
        return "Mouster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
