# Collection接口和常用方法

## 一.特点

![image-20250515184346145](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250515184346145.png)





## 二.方法

### 1.常用方法

![image-20250515184448103](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250515184448103.png)

```java
public class CollectMethod01 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        //add 添加单个元素
        list.add("sss");
        list.add(100);//list.add(new Integer(10));
        list.add(true);
        System.out.println("list="+ list);
        //remove 删除指定元素
        list.remove(0);//删除第一个元素
        list.remove(true);//指定删除某个元素
        System.out.println(list);
        //contains
        System.out.println(list.contains(100));
        //size获取元素个数
        System.out.println(list.size());
        //isEmpty 判断是否为空
        System.out.println(list.isEmpty());
        //clear 清空
        //list.clear();
        //System.out.println("list="+ list);
        ArrayList arrayList = new ArrayList();
        arrayList.add("红楼梦");
        arrayList.add("三国演义");
        list.addAll(arrayList);
        System.out.println(list);
        //containsAll 查找多个元素是否都存在
        System.out.println(list.containsAll(arrayList));
        //removeAll 删除多个元素
        list.removeAll(arrayList);
        System.out.println(list);
    }
}
```



### 2.迭代器遍历

#### 2.1

![image-20250515211624406](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250515211624406.png)

**原理：**

![image-20250515212940235](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250515212940235.png)

![image-20250515213044768](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250515213044768.png)



```java
public class collectionIterator {
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("红楼梦","曹雪芹",34.6));
        col.add(new Book("小李飞刀","古龙",5.1));

        System.out.println("col="+col);

        //遍历
        //1.先得到col 对应的 迭代器
        Iterator iterator = col.iterator();
        //2.使用while循环遍历
//        while (iterator.hasNext()){//判断是否还有数据
//            //返回下一个元素
//            Object obj = iterator.next();
//            System.out.println("obj="+ obj);
//        }
        //快捷键生成 while => itit
        //显示所有快捷键的快捷键 ctrl + j
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj="+obj);
        }
        //退出while循环后，这时iterator迭代器，指向最后的元素
        //iterator.next();NoSuchElementException

        //如果希望再次遍历，需要重置我们的迭代器
        iterator = col.iterator();
        System.out.println("====第二次遍历====");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("obj=" + next);
        }

    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

```



#### 2.2 集合增强for

![image-20250515220533464](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250515220533464.png)

```java
public class collectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("红楼梦","曹雪芹",34.6));
        col.add(new Book("小李飞刀","古龙",5.1));

        //使用增强for循环(理解为简化版本的 迭代器) 快捷方式：I
        for (Object book : col){
            System.out.println("book=" + book);
        }
        //增强for，也可以在数组使用
        int[] nums = {1,8,10,90};
        for (int i : nums){
            System.out.println("i=" + i);
        }
    }
}
```



#### 2.3测试题

![image-20250516134257886](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250516134257886.png)

```java
public class Homework {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("hei",3));
        list.add(new Dog("bai",2));
        list.add(new Dog("huang",4));

        for (Object dog : list) {
            System.out.println("dog="+dog);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog =  iterator.next();
            System.out.println("dog="+dog);

        }
    }
}
class Dog{
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

