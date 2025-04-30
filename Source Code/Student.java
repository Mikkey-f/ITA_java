package com.poly.polyarr;

public class Student extends Person{
    private int score ;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String say() {
        return "学生"+ super.say()+" score="+score;
    }
    public void study(){
        System.out.println("学生"+getName()+"正在学习");
    }
}
