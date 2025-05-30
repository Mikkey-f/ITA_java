package upload;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 司志俊
 * @version 1.0
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        String filePath = "d:\\szj.pnj";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
        //buf是filePath对应的字节数组
        byte[] buf = StreamUtils.streamToByteArray(bufferedInputStream);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(buf);//将文件对应的字节数组内容写入到数据通道

        bufferedInputStream.close();
        socket.shutdownOutput();//设置写入数据的结束标记

        //接收从服务端回复的数据
        InputStream inputStream = socket.getInputStream();
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

        //关闭
        bufferedOutputStream.close();
        socket.close();

    }
}
