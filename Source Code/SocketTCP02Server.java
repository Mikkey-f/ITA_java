package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 司志俊
 * @version 1.0
 */
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {

        //监听
        // 细节：要求本机没有其他服务器在监听9999
        // 这个 ServerSocket 可以通过accept()返回多个Socket(多个客户端连接服务器的并发)
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听，等待连接..");
        // 如果有客户端连接，则会返回Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务端socket = " + socket.getClass());

        //通过socket.getInputStream(); 读取客户端写入到数据通的数据，显示
        InputStream inputStream = socket.getInputStream();

        //4.IO读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLen));
        }

        //5.获取socket相关的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
        //写入结束标记
        socket.shutdownOutput();

        //6.关闭流和socket
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
