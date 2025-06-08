package api_InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress1 {
    public static void main(String[] args) throws UnknownHostException {

        //1. 获取本机的InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//lixinran/10.27.5.254(主机名+对应的ip)

        //2. 根据指定主机名 获取 InetAddress对象
        InetAddress host1 = InetAddress.getByName("lixinran");
        System.out.println("host1="+host1);//lixinran/10.27.5.254

        //3. 根据域名返回 InetAddress对象, 比如 www.baidu.com 对应
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);//域名+ip: www.baidu.com/183.2.172.177

        //4. 根据InetAddress对象, 获取对应的地址
        String hostAddress = host2.getHostAddress();
        System.out.println("host2 对应的ip ="+hostAddress);//183.2.172.177

        //5. 根据InetAddress对象, 获取对应的主机名/或域名
        String hostName = host2.getHostName();
        System.out.println("host2对应的主机名/域名="+hostName);//www.baidu.com
    }
}
