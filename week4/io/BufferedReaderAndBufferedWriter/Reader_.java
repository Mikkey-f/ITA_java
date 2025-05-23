package io.BufferedReaderAndBufferedWriter;

public abstract class Reader_ {//抽象类
    public  void readFile(){

    }
    public void readString(){

    }
    //也可以用read()方法统一管理
    //后面在调用时，利用对象动态绑定机制,绑定到对应的实现子类即可
}
//节点流--->和具体的数据源相关
class FileReader_ extends Reader_{
    public void readFile(){
        System.out.println("对文件读取");
    }
}
class StringReader_ extends Reader_{
    public void readString(){
        System.out.println("读取了字符串");
    }
}
//做成处理流（包装流）
class BufferedReader_ extends Reader_{
    private Reader_ reader_;
    //接收Reader_的子类对象
    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }
    public void readFile(){
        this.reader_.readFile();
    }
    //让方法更灵活,多次读取文件
    public void readFiles(int num){
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }
    //扩展 readString,批量处理字符串数据
    public void readString(int num){
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
}