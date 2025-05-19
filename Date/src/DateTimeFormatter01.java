import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormatter01 {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();//获取当前时间
        System.out.println(ldt);
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy年MM月dd日 E HH:mm:ss");//获得一个格式化器
        String format=dtf.format(ldt);//获得格式化之后的字符串
        System.out.println(format);
        System.out.println(ldt.getYear());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getMonthValue());
        System.out.println("==================================");
        Instant now=Instant.now();
        System.out.println(now);///
        Date date= Date.from(now);
        System.out.println(date);///
        Instant instant=date.toInstant();
        System.out.println(instant);///
        System.out.println("==================================");

        LocalDate now1=LocalDate.now();
        LocalDateTime now2=LocalDateTime.now();
        System.out.println(now1);
        System.out.println(now2);
        LocalDate localDate=now1.plusMonths(123);
        LocalDateTime localDateTime=now2.plusMinutes(1234564);
        System.out.println(localDate);
        System.out.println(localDateTime);
    }
}
