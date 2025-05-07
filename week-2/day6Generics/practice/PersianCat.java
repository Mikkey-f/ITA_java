package day6Generics.practice;

public class PersianCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的"+getAge()+"岁的PersianCat,正在吃饼干");
    }
}
