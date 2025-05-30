package upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 司志俊
 * @version 1.0
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception{
        //1.服务器在本机监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在8888端口监听");
        //2.等待连接
        Socket socket = serverSocket.accept();

        //3.读取客户端发送的数据
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        //socket.getInputStream() 方法返回一个 InputStream 对象，这个对象可以用来读取客户端发送的数据。
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

        //4.将得到的bytes数组写入到指定的；路径，就得到一个文件
        String destFilePath = "d\\szj11.pnj";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.close();

        //向客户端回复“收到图片”
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("收到图片");
        bufferedWriter.flush();//把内容刷新到数据通道
        socket.shutdownOutput();

        bufferedWriter.close();
        bufferedInputStream.close();
        socket.close();
        serverSocket.close();
    }
}
