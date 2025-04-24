package java1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Datedemo1 {
    public static void main(String[]args) throws ParseException {
        //Date date1=new Date(); 获取当前时间。
        //Date date=new Date();  设为初始时间。
        //date.setTime(1000);  初始时间后1000ms.
        //比较两个时间:
//        Random r=new Random();
//        Date date1=new Date(r.nextInt());
//        Date date2=new Date(r.nextInt());
//        long cmp1=date1.getTime();
//        long cmp2=date2.getTime();
//        if(cmp2<cmp1){
//            System.out.println("date2时间短");
//        } else if (cmp2>cmp1) {
//            System.out.println("date2时间长");
//        }
//        else {
//            System.out.println("时间一样长");
//        }

        /*二. SimpleDateFormat类   */
        /*1.   格式化     */
        SimpleDateFormat sdf1=new SimpleDateFormat();
        Date date1=new Date(0L);
        String str1=sdf1.format(date1);
        System.out.println(str1);

        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        Date date2=new Date(0L);
        String str2=sdf2.format(date2);
        System.out.println(str2);
        /*2.    解析     */
        String str3="2023-11-11 11:11:11";
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date3=sdf3.parse(str3);
        System.out.println(date3.getTime());

        /*练习   */
        Scanner sc=new Scanner(System.in);
        String sb="2000-11-11";
        SimpleDateFormat sdf4=new SimpleDateFormat("yyyy-MM-dd");
        Date dat=sdf4.parse(sb);
        long ms=dat.getTime();
        Date dat2=new Date();
        dat2.setTime(ms);
        SimpleDateFormat sdf5=new SimpleDateFormat("yyyy年MM月dd日");
        String sb2=sdf5.format(dat2);
        System.out.println(sb2);
    }
}

