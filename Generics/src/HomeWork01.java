import java.util.ArrayList;
import java.util.Comparator;

public class HomeWork01 {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList=new ArrayList<>();
        arrayList.add(new Employee("小a",1200,new MyDate(1,2,2003)));
        arrayList.add(new Employee("小a",1900,new MyDate(4,9,2003)));
        arrayList.add(new Employee("小a",80000,new MyDate(12,13,2006)));
        //先看名字，从小到大，再看生日，从小到大
        arrayList.sort(new Comparator<Employee>(){
            public int compare(Employee e1,Employee e2) {
                int temp = e1.getName().compareTo(e2.getName());
                if (temp != 0)
                    return temp;
                return e1.getBirthday().compareTo(e2.getBirthday());
            }
        });
        for(Employee e:arrayList){
            System.out.println(e);
        }
    }
}
class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
    @Override
    public int compareTo(MyDate another){
        int temp;
        temp = year - another.getYear();
        if (temp != 0)
            return temp;
        temp = month - another.getMonth();
        if (temp != 0)
            return temp;
        temp = day - another.getDay();
        if (temp != 0)
            return temp;
        else
            return 0;
    }
}
