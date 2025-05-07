package codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie nh = new Movie("nh",1);

    }
}
class Movie{
    private String name;
    private double price;
    private String director;

    {
        System.out.println("电影开始了。。。。");
        System.out.println("广告开始了。。。。");
    }
    public Movie(String name) {
        System.out.println("Movie(String name)被调用了");
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }

}