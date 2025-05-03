package day4.lambda;

import java.time.*;

public class JDK8time2 {
    public static void main(String[]args){
        /*1.  日历类: LocalDate,LocalTime,LocalDateTime   */
        System.out.println("----------------");
        //1.static xxx now; 获得当前时间的对象。
        LocalDate nowdate=LocalDate.now();
        System.out.println(nowdate.getDayOfMonth());
        System.out.println(nowdate.getDayOfWeek());
        System.out.println(nowdate.getDayOfYear());
        //2.static xxx of(....);获得指定时间的对象
        LocalDate iddate=LocalDate.of(2023,1,1);
        System.out.println(iddate);
        //3.get开头的方法：获取日历中的年月日
        System.out.println(nowdate.getDayOfMonth());
        System.out.println(iddate.getDayOfYear());
        //获取月
        Month m=iddate.getMonth();
        System.out.println(m);//january;
        System.out.println(m.getValue());//1  法1.....

        int m1=iddate.getMonthValue();
        System.out.println(m1);//1   法二.......

        //4.isBefore,ifAfter
        boolean y1=nowdate.isAfter(iddate);
        System.out.println(y1);
        //5.with开头的：修改时间的方法。
        LocalDate m2=iddate.withYear(2025);
        System.out.println(m2);
        //6.minus开头的：减少时间的方法。
        //7.plus开头的，增加时间的方法。

        //二.LocalTime:获取本地日期的日历对象（时/分/秒）
        //1.Duration 用于计算两个时间间隔（秒，纳秒）
        LocalDateTime t3=LocalDateTime.now();
        LocalDateTime t4=LocalDateTime.of(2023,5,1,0,00,00);
        Duration duration=Duration.between(t4,t3);
        System.out.println(duration.toDays());//两个时间差的天数
        //2.Period 用于计算两个日期间隔（年月日）
        LocalDate t1=LocalDate.now();//2025-5-2
        LocalDate t2=LocalDate.of(2025,5,1);
        Period period= Period.between(t2,t1);
        System.out.println(period);//间隔多少天
        System.out.println(period.getMonths());//
        //3.ChronoUnit 计算两个日期间隔
    }
}
