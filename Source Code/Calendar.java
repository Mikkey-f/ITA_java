package Calendar_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Calendar {
    public static void main(String[] args) {
        //使用now()返回表示当前日期时间的对象
        LocalDateTime locate = LocalDateTime.now();
        System.out.println(locate);
        System.out.println("年="  +locate.getYear());
        System.out.println("月="  +locate.getMonth());
        //.......
        System.out.println("分="  +locate.getMinute());

        //使用DateTimeFormatter 对象来进行格式化
        DateTimeFormatter dtfm = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dtfm.format(locate);
        System.out.println("格式化的日期="+format);
    }
}
