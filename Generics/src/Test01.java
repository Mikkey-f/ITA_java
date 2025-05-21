import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        HashSet<Student> hashSet =new HashSet<Student>();
        //HashSet hashSet =new HashSet();
        hashSet.add(new Student("小明","202419130409"));
        hashSet.add(new Student("小红","202419130408"));
        hashSet.add(new Student("小刚","202419130406"));
        Iterator<Student> it=hashSet.iterator();
        /*
        terator<Student> 明确指定了迭代器返回的元素类型为 Student。因此：
        it.next() 的返回值类型直接是 Student，无需强制类型转换。
        如果集合中实际存储的不是 Student 类型（例如存储了 Teacher 对象），编译器会报错。
         */
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //hashSet.add(new Teacher());不可以
        HashMap<String,Student> hashMap=new HashMap<String,Student>();
        hashMap.put("小明",new Student("小明","202419130409"));
        hashMap.put("小红",new Student("小红","202419130408"));
        hashMap.put("小刚",new Student("小刚","202419130406"));
        Set<Map.Entry<String,Student>> entrySet=hashMap.entrySet();
        for(Map.Entry m:entrySet){
            System.out.println(m);
        }
        System.out.println("=================================");
        Iterator<Map.Entry<String,Student>> it1=entrySet.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next().getKey());
        }
    }
}
class Student{
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
class Teacher{

}
