package day3;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;

public class jdk8time {
    public static void main(String[]args){
        /*1. date类*/
        Set<String> zoneids=ZoneId.getAvailableZoneIds();/*-->获取所有时区名称*/
        System.out.println(zoneids.size());//603
        System.out.println(zoneids);
        /*获取当前系统默认时区*/
        ZoneId zoneId=ZoneId.systemDefault();
        System.out.println(zoneId);
        /*获取指定时区*/
        ZoneId zoneId1=ZoneId.of("Asia/Aqtau");
        System.out.println(zoneId1);
        /*2. 时间戳  */
        //1.获取当前时间对象
        Instant now=Instant.now();
        System.out.println(now);
        //2.根据（秒/毫秒/纳秒）获取Instant对象。
        Instant ints=Instant.ofEpochMilli(0L);
        System.out.println(ints);
        Instant ints1=Instant.ofEpochSecond(1L);
        System.out.println(ints1);
        Instant ints2=Instant.ofEpochSecond(1L,1000000000L);
        System.out.println(ints2);
        //3.指定时区
        ZonedDateTime time=Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);
        //4.isxxx:表示判断: isafter(是否在该时间后面）isbefore(是否在该时间后面)*/
        Instant ints3=Instant.ofEpochMilli(0L);
        Instant ints4=Instant.ofEpochMilli(1110L);
        boolean y1=ints3.isAfter(ints4);
        boolean y2=ints3.isBefore(ints4);
        System.out.println(y1);
        System.out.println(y2);
        //5.Instant minusxxx(long millsTosubstract)减少时间
        Instant result1=Instant.ofEpochMilli(3000L);
        Instant result2=result1.minusSeconds(1);
        System.out.println(result2);
        //6。Instant plusxxx(long millsTosubstract)
        /*3. ZoneDatetime:带时间的地区*/
        //1.static ZoneDatetime now():当前时间的ZoneDatetime对象·。
        //2.static ZoneDatetime ofxxx(...):获取指定时间的ZoneDatetime对象。
        //3.ZoneDatetime withxxx(时间）:修改时间
        //4.ZoneDatetime minusxxx(时间):减少时间
        //5.ZoneDatetime plusxxx:增加时间


        /*4    DateTimeFormatter   */
        //1.获取格式对象: static DateTimeFormatter ofPattern(格式).
        //2.按指定方式格式化: String format
        ZonedDateTime time2=Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        //解析/格式化器
        DateTimeFormatter df1=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(df1.format(time2));
    }

}
