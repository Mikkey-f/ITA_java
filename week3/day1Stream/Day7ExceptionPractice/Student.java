package Day7ExceptionPractice;

import java.util.Scanner;

public class Student {
    public static void main(String[]args){
        //输入学生的姓名和名字
        Studenclass s=new Studenclass();
        boolean flag=false;
        while (!flag){
            Scanner sc=new Scanner(System.in);
            try {
                System.out.println("请输入学生姓名");
                String stuname=sc.nextLine();
                s.setName(stuname);
                System.out.println("请输入学生年龄");
                String age=sc.nextLine();
                int stuage=Integer.parseInt(age);
                s.setAge(stuage);
                break;
                //flag=true;
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
                //flag=false;
            }catch (NameFormatException e){
                e.printStackTrace();
                //System.out.println("姓名的长度或年龄的范围有问题");
                //flag=false;
            }
        }
        System.out.println(s);
    }
}
