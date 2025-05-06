public class Test {
    public static void main(String[] args){
        Object object=new Person("小黄",12,"女");
        Person person1=new Person("小明",22,"男");
        Person person2=new Person("小黄",12,"女");
        Student student=new Student("小明",22,"男");
        A a=new A("小明",22,"男");
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(student));
        System.out.println(object.equals(person2));
        System.out.println(person1.equals(a));
        System.out.println(student.equals(a));
    }
}
