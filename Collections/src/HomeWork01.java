import java.util.ArrayList;
import java.util.Collections;

public class HomeWork01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠确诊超过千万，百万印度教徒赴恒河\"圣浴\"引民众担忧"));
        arrayList.add(new News("男子突然想起两个月前钓的鱼还在网兜里，捞起来一看赶紧放生"));
        for(int i=arrayList.size()-1;i>=0;i--)
            System.out.println(arrayList.get(i));
    }
}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        if (title.length() > 15) {
            return "《"+ title.substring(0,15) +"..."+"》" ;
        } else
            return "《"+title+"》";
    }
}
