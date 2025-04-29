package com.extend_.improve_;
//Pupil和Graduate的父类
public class student {
    //共有属性
    public String name;
    public int age;
    private double score;

    //共有的方法
    public void setScore(double score) {
        this.score = score;
    }
    public void test1(){
        System.out.println("信息"+name+age+score);
    }
}
