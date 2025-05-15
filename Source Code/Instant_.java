package Calendar_;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Instant_ {
    public static void main(String[] args) {
        //通过 静态方法 now（）返回表示当前时间戳的对象
        Instant now = Instant.now();
        //System.out.println(now);

        //通过 from 可以把Instant转成 Date

        Date date = Date.from(now);
        //通过date.toInstant()可以把 date 转成Instant对象
        Instant instant  = date.toInstant();

        //看看890天后是什么时候，输出年月日-时分秒
        LocalDateTime locate = LocalDateTime.now();
        LocalDateTime localDateTime = locate.plusDays(890);
        DateTimeFormatter dtfm = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtfm.format(locate));
        System.out.println("890天后=" + dtfm.format(localDateTime));

        //看看2344分钟前是什么时候，把年月日-时分秒输出
        LocalDateTime localDateTime1 = locate.minusMinutes(2344);
        System.out.println("2344分钟前=" + dtfm.format(localDateTime1));
    }
}
