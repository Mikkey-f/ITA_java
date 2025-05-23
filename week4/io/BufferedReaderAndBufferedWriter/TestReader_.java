package io.BufferedReaderAndBufferedWriter;
//           多态的运用。
public class TestReader_ {
    public static void main(String[] args) {
        //对文件多次读取
        BufferedReader_ bufferedReader = new BufferedReader_(new FileReader_());
        bufferedReader.readFiles(5);
        //对字符串多次读取
        BufferedReader_ bufferedReader1=new BufferedReader_(new StringReader_());
        bufferedReader1.readString(3);
    }
}
