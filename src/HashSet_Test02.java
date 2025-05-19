//import java.util.HashSet;
//import java.util.Objects;
//import java.util.Set;
//
//public class HashSet_Test02 {
//    public static void main(String[] args) {
//        HashSet hashSets = new HashSet();
//        hashSets.add(new Employee("小明", "实习生", new MyDate(2006, 06, 06)));
//        hashSets.add(new Employee("小红", "实习生", new MyDate(2005, 07, 18)));
//        hashSets.add(new Employee("小明", "练习生 ", new MyDate(2006, 06, 06)));
//        System.out.println(hashSets);
//        System.out.println("======================================================================");
//        for (Object o : hashSets) {
//            System.out.println(o);
//        }
//    }
//}
//
//class Employee {
//    private String name;
//    private String sal;
//    private MyDate birthday;
//
//    public Employee(String name, String sal, MyDate birthday) {
//        this.name = name;
//        this.sal = sal;
//        this.birthday = birthday;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", sal='" + sal + '\'' +
//                ", birthday=" + birthday +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return name.equals(employee.name) && birthday.equals(employee.birthday);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, birthday);
//    }
//}
//
//class MyDate {
//    private int year;
//    private int month;
//    private int day;
//
//    public MyDate(int year, int month, int day) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
//
//    @Override
//    public String toString() {
//        return "MyDate{" +
//                "year=" + year +
//                ", month=" + month +
//                ", day=" + day +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null || this.getClass() != o.getClass())
//            return false;
//        MyDate myDate = (MyDate) o;
//        return year == myDate.year && month == myDate.month && day == myDate.day;
//    }
//    @Override
//    public int hashCode(){
//        return Objects.hash(year,month,day);
//    }
//}
