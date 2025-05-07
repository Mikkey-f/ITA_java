package stasic;

public class ChildGame {
    public static void main(String[] args) {
        //int count = 0;
        Child child1 = new Child("sizhijun");
        Child child2 = new Child("fy");
        Child child3 = new Child("nnn");
        child3.join();
        //count++;
        child3.count++;
        child2.join();
        child2.count++;
        child1.join();
        //count++;
        child1.count++;
        //count++;
        System.out.println("共有" + child2.count + "个小孩加入游戏");
    }
}

class Child {
    private String name;
    //定义一个变量count，是一个类变量(静态变量)static 静态
    //最大特点是会被所有Child类的所有对象共享
    public static int count=0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏。。。。");
    }
}