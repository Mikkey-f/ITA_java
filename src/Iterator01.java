//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//
//public class Iterator01 {
//    public static void main(String[] args) {
//        Collection col =new ArrayList();
//        col.add(new Book("红楼梦","曹雪芹",100));
//        col.add(new Book("哈哈哈","jack",12.5));
//        col.add(new Book("历险记","马克吐温",99));
//        col.add(145);
//        col.add("成都理工大学");
//        Iterator it=col.iterator();
//        while(it.hasNext()){
//            Object obj=it.next();
//            System.out.println(obj);
//        }
//        it=col.iterator();//重置迭代器
//        System.out.println(it.next());
//        System.out.println("==========");
//        for(Object obj:col){
//            System.out.println(obj);
//        }
//
//    }
//}
//class Book{
//    private String name;
//    private  String author;
//    private double price;
//
//    public Book(String name, String author, double price) {
//        this.name = name;
//        this.author = author;
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", price=" + price +
//                '}';
//    }
//}
