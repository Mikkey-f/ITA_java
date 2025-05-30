package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 司志俊
 * @version 1.0
 */
public class SocketTCP03Server {
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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        //5.获取socket相关的输出流
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client 字符流");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        //写入结束标记


        //6.关闭流和socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
