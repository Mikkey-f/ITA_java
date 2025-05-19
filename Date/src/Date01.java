import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) {
        //Date 默认格式 国外的
        Date d=new Date();//调用无参构造器获得当前日期
        System.out.println(d);
        Date d2=new Date(25434234);//调用有参构造器，获得特定日期
        System.out.println(d2);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 E hh:mm:ss");//创建了一个SimpleDateFormat的对象
        //用构造器指定了日期应该怎么格式化
        String date=sdf.format(d);//使用对象的format方法对日期进行格式化
        String date2=sdf.format(d2);
        System.out.println(date);
        System.out.println(date2);
        System.out.println("================");
        String s="2025年11月07日 15:24:45";
        try {
            Date parse1=sdf.parse(s);
            System.out.println(parse1);
        } catch (ParseException e) {
            System.out.println("日期格式错误");
        }
    }
}
