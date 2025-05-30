package szj;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 司志俊
 * @version 1.0
 * 演示InetAddress 类的使用
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {

        //1.获取本机的InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//LAPTOP-GC2KTEF6/10.27.157.157

        //2.根据指定的主机名 获取InetAddress对象
        InetAddress host = InetAddress.getByName("LAPTOP-GC2KTEF6");
        System.out.println("host=" + host);

        //3.根据一个域名返回 InetAddress对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2=" + host2);

        //4. 通过 InetAddress 对象，获取对应的地址
        String host2Address = host2.getHostAddress();//IP 110.242.68.4
        System.out.println("host2对应的ip=" + host2Address);

        // 通过InetAddress对象，获取对应的主机名或者域名
        String hostName = host2.getHostName();
        System.out.println("host2对应的主机名/域名:" + hostName);
    }
}
