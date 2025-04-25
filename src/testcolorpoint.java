public class testcolorpoint {
    public static void main(String[]args){
        point p1=new Colorpoint(10,10,"红色");
        point p2=new Colorpoint2(10,10,10);
        show(p1);
        show(p2);
    }
    public static void show(point p){
        String s1=p.tostring();
        System.out.println(s1);
    }
}
