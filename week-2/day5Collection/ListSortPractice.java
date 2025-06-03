package day5Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortPractice {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Book("书1",100,"张三"));
        list.add(new Book("书2",150,"李四"));
        list.add(new Book("书3",120,"王五"));
        Collections.sort(list,new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPrice()-o2.getPrice();
            }
        });
        System.out.println(list);
    }
}
class Book{
    private String name;
    private int price;
    private String writer;

    public Book(String name, int price, String writer) {
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
        return "Book{" +
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