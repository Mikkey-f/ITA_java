package Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Exercise {
    public static void main(String[] args) {
        Book[] book = new Book[4];
        book[1] = new Book("红楼梦",12);
        book[2] = new Book("金瓶梅新",11);
        book[3] = new Book("青年文摘20",19);
        book[0] = new Book("java入门到放弃",100);

        Arrays.sort(book, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b = (Book) o1;
                Book b1 = (Book) o2;
                double price = b.name.length() - b1.name.length();
                if (price>0){
                    return -1;
                }
                else if (price<0){
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });

        System.out.println(Arrays.toString(book));
    }
}
class Book{
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}