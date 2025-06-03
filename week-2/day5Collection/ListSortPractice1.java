package day5Collection;

import java.util.ArrayList;
import java.util.List;

public class ListSortPractice1 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Book1("书1",100,"张三"));
        list.add(new Book1("书2",150,"李四"));
        list.add(new Book1("书3",120,"王五"));

        sort(list);
        System.out.println(list);
    }
    public static void sort(List list){
        int len=list.size();
        for(int i=0;i<len;i++){
            for(int j=0;j<len-1-i;j++){
                Book1 book1=(Book1)list.get(j);
                Book1 book2=(Book1)list.get(j+1);
                if(book1.getPrice()>book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}
class Book1{
    private String name;
    private int price;
    private String writer;

    public Book1(String name, int price, String writer) {
        this.name = name;
        this.price = price;
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", writer='" + writer + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}