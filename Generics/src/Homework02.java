import org.junit.jupiter.api.Test;

import java.util.*;

public class Homework02 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        DAO<User> dao=new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,20,"lisa"));
        dao.save("007",new User(1,1,"smith"));
        List<User> list=dao.list();
        System.out.println(list);
        System.out.println(dao);
    }
}
class DAO<T>{
    private Map<String,T> map= new HashMap<>();

//    public DAO() {
//    }
//
//    public DAO(Map<String,T> map){
//        this.map=map;
//    }
    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        List<T> list=new ArrayList<>();
        Set<String> keySet=map.keySet();
        for(String key:keySet){
            list.add(map.get(key));
        }
        return list;
    }
    public void delete(String id){
        map.remove(id);
    }

    @Override
    public String toString() {
        return "DAO{" +"\n"+
                "map=" + map +
                '}';
    }
}
class User{
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}'+"\n";
    }
}
