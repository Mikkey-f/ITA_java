# TCP网络通信编程

## 一.介绍

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250529212009075.png" alt="image-20250529212009075" style="zoom: 67%;" />





## 二.应用案例

### 1.

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250529212129688.png" alt="image-20250529212129688" style="zoom: 80%;" />

**示意图：**

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250529212638609.png" alt="image-20250529212638609" style="zoom:67%;" />

#### 客户端：

```java
public class SocketTCP01Client {
    public static void main(String[] args) throws Exception {

        //1.连接服务器（ip，端口）
        //解读:连接本机的 9999端口,如果连接成功，返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回=" + socket.getClass());

        //2.连接上后，生成Socket，通过socket.getOutputStream()
        //得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

        //3.通过输出流，写入数据到数据通道
        outputStream.write("hello,server".getBytes());

        //4.关闭流对象和socket，必须关闭
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
```



#### 服务端

```java
public class SocketTCP01Server {
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

        //5.关闭流和socket
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
```



### 2.

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250529220257777.png" alt="image-20250529220257777" style="zoom:67%;" />

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250529221536935.png" alt="image-20250529221536935" style="zoom: 67%;" />

**客户端**

```java
public class SocketTCP02Client {
    public static void main(String[] args) throws Exception {

        //1.连接服务器（ip，端口）
        //解读:连接本机的 9999端口,如果连接成功，返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回=" + socket.getClass());

        //2.连接上后，生成Socket，通过socket.getOutputStream()
        //得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

        //3.通过输出流，写入数据到数据通道
        outputStream.write("hello,server".getBytes());
        //设置写入结束标记
        socket.shutdownOutput();

        //4.获取和socket关联的输入流，读取数据并显示
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLen));
        }

        //5.关闭流对象和socket，必须关闭
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
```



**服务端**

```java
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
```





### 3.

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250530163158465.png" alt="image-20250530163158465" style="zoom:67%;" />

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250530163955794.png" alt="image-20250530163955794" style="zoom:67%;" />



客户端：

```java
public class SocketTCP03Client {
    public static void main(String[] args) throws Exception {

        //1.连接服务器（ip，端口）
        //解读:连接本机的 9999端口,如果连接成功，返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回=" + socket.getClass());

        //2.连接上后，生成Socket，通过socket.getOutputStream()
        //得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

        //3.通过输出流，使用字符流写入数据到数据通道
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server 字符流");
        bufferedWriter.newLine();//插入一个换行符，表示写入内容结束，注意要求服务端使用readLine()来读
        bufferedWriter.flush();//如果使用的字符流，需要手动刷新，否则数据不会写入数据通道
        //设置写入结束标记
        socket.shutdownOutput();

        //4.获取和socket关联的输入流，读取数据并显示
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        //5.关闭流对象和socket，必须关闭
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
```



服务端：

```java
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
```





### 4.网络上传文件

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250530171858363.png" alt="image-20250530171858363" style="zoom:67%;" />

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250530171839898.png" alt="image-20250530171839898" style="zoom:67%;" />



工具类：

```java
public class StreamUtils {

    public static byte[] streamToByteArray(InputStream is) throws Exception{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] b = new byte[1024];
        int len;
        while (((len = is.read(b)) != -1)){
            bos.write(b,0,len);
        }
        byte[] array = bos.toByteArray();
        bos.close();
        return array;
    }

    public static String streamToString(InputStream is) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null){
            builder.append(line + "\r\n");
        }
        return builder.toString();
    }
}
```



客户端：

`Socket` 类的 `getInputStream()` 方法用于获取与该 `Socket` 对象关联的输入流。当客户端和服务端通过 `Socket` 建立连接后，客户端向服务端发送的数据会通过网络传输到服务端，服务端就可以使用 `getInputStream()` 方法获取这个输入流，从而读取客户端发送过来的数据。

```java
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        String filePath = "d:\\szj.pnj";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
        //buf是filePath对应的字节数组
        byte[] buf = StreamUtils.streamToByteArray(bufferedInputStream);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        ////socket.getInputStream() 方法返回一个 InputStream 对象，这个对象可以用来读取客户端发送的数据。
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
```



服务端：

`Socket` 类的 `getInputStream()` 方法用于返回一个输入流对象（`InputStream`），该输入流可以从与之连接的套接字中读取数据。在 TCP 网络编程中，当服务端和客户端通过 `Socket` 建立连接后，客户端向服务端发送的数据会通过网络传输到服务端的套接字，服务端就可以使用 `getInputStream()` 方法获取对应的输入流，从而读取客户端发送过来的数据。

```java
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception{
        //1.服务器在本机监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在8888端口监听");
        //2.等待连接
        Socket socket = serverSocket.accept();

        //3.读取客户端发送的数据
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        //调用 socket.getInputStream() 方法，返回一个 InputStream 对象，这个对象可以从客户端的套接字中读取数据
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
```

