import java.util.TreeSet;

public class Homework03 {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();
        treeSet.add(new Person());
        treeSet.add(new Person());
        treeSet.add(new Person());
        treeSet.add(new Person());
        treeSet.add(new Person());
        System.out.println(treeSet);
    }
}
class Person implements Comparable<Person>{
    @Override
    public int compareTo(Person another){
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
