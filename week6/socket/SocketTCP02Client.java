package socket;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

//客户端
public class SocketTCP02Client {
    public static void main(String[] args) throws Exception{
        //思路
        //1. 连接服务端 (ip,端口)
        // 解读: 连接本机的 9999端口, 如果连接成功,返回Socket对象
        Socket socket=new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("客户端 socket 返回="+socket.getClass());
        //2. 连接上后,生成Socket，通过socket.getOutputStream
        //   得到和socket对象关联的输出流对象
        OutputStream opS = socket.getOutputStream();
        //3. 通过输出流写入 数据到数据管道
        opS.write("hello,server".getBytes());

        socket.close();
        opS.close();
    }
}
