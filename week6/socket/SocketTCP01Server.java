package socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端   客户端和服务端各有一个Socket对象
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //思路
        //1. 在本机的9999端口监听, 等待连接
        //   细节: 要求在本机没有其他服务在监听9999
        //   细节: 这个 ServerSocket 可以通过accept()返回多个Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听,等待连接");
        //2. 当没有客户端连接9999端口时, 程序会阻塞, 等待连接
        //   如果有客户端连接, 会返回Socket对象,继续执行
        Socket socket=serverSocket.accept();
        System.out.println("服务端 socket="+socket.getClass());

        //3.通过socket.getInputStream 读取客户端写入到数据通道中的数据
        InputStream ips = socket.getInputStream();
        //4.IO读取
        byte[] bytes=new byte[1024];
        int readline=0;
        while((readline=ips.read(bytes))!=-1){
            System.out.println(new String(bytes,0,readline));
        }
        ips.close();
        socket.close();
        serverSocket.close();
    }
}
