package day6Generics.practice;

import java.util.ArrayList;

public class Testdemo1 {
    public static void main(String[]args){
        ArrayList<Lihuacat>list1=new ArrayList<>();
        ArrayList<PersianCat>list2=new ArrayList<>();
        ArrayList<Teddy>list3=new ArrayList<>();
        //keepPet1(list1);//keep1中无法传入，只能传入Cat及其父类对象。
        //keepPet1(list2);
        //keepPet(list3); keepPet中无法传入，因为只能传入Cat及其子类对象，

    }
    public static void keepPet(ArrayList<? extends Cat>list){

    }
    public static void keepPet2(ArrayList<? super Cat>list){

    }
}
