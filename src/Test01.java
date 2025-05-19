import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Book("红楼梦","曹雪芹",100));
        list.add(new Book("哈哈哈","jack",12.5));
        list.add(new Book("历险记","马克吐温",99));
//        Collections.sort(list,new Comparator<Book>(){
//            public int compare(Book b1,Book b2){
//                double d1=b1.getPrice(),d2=b2.getPrice();
//                if(d1>d2)
//                    return 1;
//                else if(d1<d2)
//                    return -1;
//                else
//                    return 0;
//            }
//        });
        sort(list);
        for(Object obj:list){
            System.out.println(obj);
        }
    }
    public static void sort(List list){
        for(int i=0;i<=list.size()-1;i++){
            for(int j=0;j<list.size()-1-i;j++){
                Book b1=(Book) list.get(j);
                Book b2=(Book) list.get(j+1);
                if(b1.getPrice()>b2.getPrice()){
                   list.set(j,b2);
                   list.set(j+1,b1);
                }
            }
        }
    }
}
class Book{
    private String name;
    private  String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名:"+name+"\t\t作者:"+author+"\t\t价格："+price;
    }
}

