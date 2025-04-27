package com.encap;

public class shili {
    public static void main(String[] args) {

    }
}
class Person{
    public String name;
    private int age;
    private double salary;

    public Person(){

    }
    public Person(String name,int age,double salary){

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}