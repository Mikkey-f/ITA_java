package com.ljw.study;

public class Account {
    //三个属性
    private String name;//姓名
    private int remind;//余额
    private String code;//密码
    public Account(){}
    public Account(String name,int remind,String code)
    {
        setName(name);
        setRemind(remind);
        setCode(code);
    }
    //setter方法
    public void setName(String name){
        if(name.length()<2||name.length()>4){
            System.out.println("名字不符合规则，给默认名字\"无名\"");
            this.name="无名";
        } else{
            this.name=name;
        }
    }
    public void setRemind(int remind){
        if(remind<=20){
            System.out.println("余额不符合规则，给默认余额\"100\"");
            this.remind=100;
        }else{
            this.remind=remind;
        }
    }
    public void setCode(String code){
        if(code.length()!=6){
            System.out.println("密码不符合规则，给默认密码\"000000\"");
            this.code="000000";
        }else{
            this.code=code;
        }
    }
    //getter方法
    public String getName(){
        return this.name;
    }
    public int getRemind(){
        return this.remind;
    }
    public String getCode(){
        return this.code;
    }
    public void showOf(){
        System.out.println(this.name+" "+this.remind+" "+this.code);
    }
}
