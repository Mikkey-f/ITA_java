import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_exercise01 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("1234567", new Employee("小明", 20000, "1234567"));
        hashMap.put("1234568", new Employee("小红", 2005, "1234568"));
        hashMap.put("1234569", new Employee("jack", 80000, "1234569"));
        System.out.println("第一种");
        Set keySet = hashMap.keySet();
        for (Object key : keySet) {
            Employee em = (Employee) (hashMap.get(key));
            if (em.getSalary() > 18000)
                System.out.println(em);
        }
        System.out.println("第二种");
        Set entrySet = hashMap.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry m = (Map.Entry) it.next();
            Employee em=(Employee) m.getValue();
            if (em.getSalary()>=18000)
                System.out.println(em);
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private String id;

    public Employee(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }
}
