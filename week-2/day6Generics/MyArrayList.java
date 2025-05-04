package day6Generics;

import java.util.Arrays;
import java.util.Objects;
// 自定义集合

public class MyArrayList <E>{
    Object[] obj=new Object[10];
    int  size;
    public boolean add(E e){
        obj[size++]=e;
        return true;
    }
    public E get(int index){
        return (E)obj[index];
    }
    public String toString(){
        return Arrays.toString(obj);
    }

}
