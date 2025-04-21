import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        while (true) {
            System.out.println("-------欢迎来到学生管理系统-------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入你的选择:");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addstudent(list);
                case "2" -> deletestudent(list);
                case "3" -> modifystudent(list);
                case "4" -> querystudent(list);
                case "5" -> {
                    System.out.println("退出");
                    return;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }
        public static void addstudent (ArrayList<student> list) {
            System.out.println("添加学生");
            System.out.println("添加学生id");
            Scanner sc = new Scanner(System.in);
            String id = sc.next();
            boolean flag = contain(list, id);
            if (flag) {
                System.out.println("当前id已存在，请重新输入！");
                return;
            }
            System.out.println("添加学生姓名");
            String name = sc.next();
            System.out.println("添加学生年龄");
            int age = sc.nextInt();
            System.out.println("添加学生地址");
            String address = sc.next();
            student stu = new student(id, name, age, address);
            list.add(stu);
            System.out.println("添加学生成功！");
        }
        public static void querystudent(ArrayList<student>list) {
            if (list.isEmpty()) {
                System.out.println("当前没有学生信息，请添加后再查询！");
                return;
            }
            System.out.println("id" + '\t' + "姓名" + "\t" + "年龄" + '\t' + "家庭住址");
            for (student stu : list) {
                System.out.println(stu.getId() + '\t' + stu.getName() + '\t' + stu.getYear() + '\t' + stu.getAddress());
            }
        }
        public static void modifystudent (ArrayList < student > list) {
            System.out.println("请输入要修改的学生id");
            Scanner sc = new Scanner(System.in);
            String id = sc.next();
            int index = getindex(list, id);
            if (index < 0) {
                System.out.println("你当前输入的:" + id + "不存在");
                return;
            }
            student stu = list.get(index);
            System.out.println("请输入新的姓名:");
            String newname = sc.next();
            stu.setName(newname);
            System.out.println("请输入新的年龄:");
            int newage = sc.nextInt();
            stu.setYear(newage);
            System.out.println("请输入新的地址:");
            String newaddress = sc.next();
            stu.setAddress(newaddress);
            System.out.println("信息修改成功！");

        }
        public static void deletestudent (ArrayList < student > list) {
            System.out.println("请输入要删除的学生id:");
            Scanner sc = new Scanner(System.in);
            String id = sc.next();
            int index = getindex(list, id);
            if (index < 0) {
                System.out.println("当前id不存在！");
                return;
            }
            list.remove(index);
            System.out.println("移除成功！");
        }
        public static boolean contain (ArrayList < student > list, String id){
            for (student stu : list) {
                if (Objects.equals(stu.getId(), id)) {
                    return true;
                }
            }
            return false;
        }
        public static int getindex (ArrayList < student > list, String id){
            for (int i = 0; i < list.size(); i++) {
                student stu = list.get(i);
                if (Objects.equals(id, stu.getId())) {
                    return i;
                }
            }
            return -1;
        }
}