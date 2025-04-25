package java1;

import java.util.Calendar;
import java.util.Date;

public class apicalendar {
    public static void main(String[]args){
        Calendar c=Calendar.getInstance(); //获取当前时间的日历对象
        Date d=new Date(0L);
       /* c.setTime(d);*/   //给日历设置日期对象
        int year=c.get(Calendar.YEAR);  //获取年，月，日，周。
        int month=c.get(Calendar.MONTH);
        int date=c.get(Calendar.DAY_OF_MONTH);
        int week=c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+", "+month+", "+date+", "+getweek(week));
    }
    public static String getweek(int date){
        String[]arr={" ","星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
        return arr[date];
    }
}
