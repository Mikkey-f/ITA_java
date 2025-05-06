package com.ljw.study;

public class AccountTest {
    public static void main(String[] args){
        Account account1=new Account("我没有名字",12,"111");
        account1.showOf();
        Account account2=new Account("小明",500,"666666");
        account2.showOf();
    }
}
