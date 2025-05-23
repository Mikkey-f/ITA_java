# JUnit

## 一.介绍

![image-20250523183215981](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250523183215981.png)

![image-20250523184314063](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250523184314063.png)

```java
public class JUnit_ {
    public static void main(String[] args) {

    }

    @Test
    public void m1(){
        System.out.println("m1");
    }
    @Test
    public void m2(){
        System.out.println("m2");
    }
}
```



## 二.练习

![image-20250523191243800](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250523191243800.png)

```java
public class Exercise01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
       DAO<User> dao = new DAO<>();
       dao.save("001", new User(1,10,"jack"));
        dao.save("002", new User(2,18,"king"));
        dao.save("003", new User(3,38,"smith"));

        List<User> list = dao.list();
        System.out.println("list=" + list);
    }
}
class DAO<T>{
    private Map<String,T> map = new HashMap<>();
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
         List<T> value = new ArrayList<>();
         //遍历map，将entity存入value
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        for (String key : keySet) {
            value.add(map.get(key));
            //==value.add(get(key));
        }
        return value;
    }
    public void delete(String id){
        map.remove(id);
    }
}

class User{
    private int id;
    private int age;
    String name;

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
                '}';
    }
}
```

