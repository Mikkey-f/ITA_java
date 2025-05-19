import java.util.Properties;

public class Properties01 {
    public static void main(String[] args) {
        Properties pro=new Properties();
        pro.put("jhon","北京大学");
        System.out.println(pro.getProperty("jhon","北京大学"));
        System.out.println(pro.get("jhon"));
    }
}
