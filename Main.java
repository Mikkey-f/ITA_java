package src1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String []args){
        ArrayList<user_>list=new ArrayList<>();
        while (true){
            Scanner sc=new Scanner(System.in);
            System.out.println("欢迎来到学生管理系统！");
            System.out.println("请选择操作:1.登录，2.注册，3.忘记密码");
            String ju=sc.next();
            switch (ju){
                case "1"-> loadsystem(list);
                case "2"->rejist(list);
                case "3"->forgetpassword(list);
            }
        }
    }
    private static void forgetpassword(ArrayList<user_>list){
        System.out.println("请输入您的用户名");
        Scanner sc=new Scanner(System.in);
        String sb=sc.next();
        if(contains(list,sb)){
            System.out.println("用户名验证成功！请继续输入");
        }
        else {
            System.out.println("当前用户名不存在，请先注册！");
            return;
        }
        System.out.println("请输入身份证号码和手机号！");
        String personid=sc.next();
        String phoneNumber=sc.next();
        int index=getindex(list,sb);
        user_ user=list.get(index);
        if (!(user.getId().equals(personid)&&user.getCard().equals(phoneNumber))){
            System.out.println("账号信息不匹配，修改失效");
            return;
        }
        String newpassword;
        String againnewpassword;
        while (true) {
            System.out.println("请输入新的密码！");
            newpassword=sc.next();
            System.out.println("请再次输入新的密码！");
            againnewpassword=sc.next();
            if (newpassword.equals(againnewpassword)){
                System.out.println("两次密码输入一致");
                break;
            }
            else {
                System.out.println("两次密码输入不一致，请重新输入");
                continue;
            }
        }
        user.setNo(newpassword);
    }
    //获取对应用户的信息
    private static int getindex(ArrayList<user_>list,String username){
        for (int i=0;i<list.size();i++){
            user_ v1=list.get(i);
            if(Objects.equals(v1.getName(), username)){
                return i;
            }

        }
        return -1;
    }
    private static void loadsystem(ArrayList<user_>list){
        Scanner sc=new Scanner(System.in);
        boolean flag;
        for(int i=0;i<3;i++){
            System.out.println("请输入用户名");
            String username=sc.next();
            flag=contains(list,username);
            if (!flag){
                System.out.println("当前用户名不存在，未注册，请先注册！");
                return;
            }
            else {
                System.out.println("继续输入其他信息");
            }
            System.out.println("请输入密码！");
            String password=sc.next();
            while (true){
                String trueyzm=getcode();
                System.out.println("正确的验证码为:"+trueyzm);
                System.out.println("请输入验证码！");
                String yzm= sc.next();
                if(trueyzm.equals(yzm)){
                    System.out.println("验证码校验成功");
                    break;
                }
                else {
                    System.out.println("请重新输入！");
                    continue;
                }
            }
            user_ user=new user_(username,password,null,null);
            //校验密码
            boolean judge=checkright(user,list);
            if(judge) {
                System.out.println("校验成功！");
                break;
            }
            else{
                System.out.println("校验失败，还剩"+(2-i)+"次机会!");
                continue;
            }
        }
    }
    private static boolean checkright(user_ user,ArrayList<user_>list){
        for (int i=0;i<list.size();i++) {
            user_ use2=list.get(i);
            if (user.getName().equals(use2.getName()) && user.getNo().equals(use2.getNo())) {
                 return true;
            }
        }
        return false;
    }
    //list中还没存储？？？？
    private static String getcode(){
        ArrayList<Character>list1=new ArrayList<>();
        for (int i=0;i<26;i++){
            list1.add((char)('a'+i));//将所有字母全放入，方便之后随机。
            list1.add((char)('A'+i));
        }
        StringBuilder sb=new StringBuilder();
        Random r=new Random();
        for(int i=0;i<4;i++){
            int index= r.nextInt(list1.size());//随机索引下标。
            char c=list1.get(index);//获取对应索引的值。
            sb.append(c);
        }
        int index=r.nextInt(10);//最后一个数字。
        sb.append(index);
        //数字可出现在任何位置。
        char []st=sb.toString().toCharArray();
        for (int i=0;i< sb.length()-1;i++){
            int index1=r.nextInt(sb.length()-1);
            char temp= sb.charAt(index1);
            st[index1]=st[sb.length()-1];
            st[sb.length()-1]=temp;//交换位置。
        }
        return new String(st);
    }
    private static void rejist(ArrayList<user_>list){
        Scanner sc=new Scanner(System.in);
        String sb;
        while (true){
            System.out.println("请输入用户名！");
            sb=sc.next();
            boolean flag=contains(list,sb);
            if (!judgeuser(sb)){
                System.out.println("用户名有误，请重新输入！");
                continue;
            }
            if(flag){
                System.out.println("您输入的用户名已存在，请重新输入");
                continue;
            }
            else {
                System.out.println("您的用户名可用！");
                break;
            }
        }
        String password;
        while (true){
            System.out.println("请输入您的密码:");
            password=sc.next();
            System.out.println("请再次数入您的密码:");
            String againPassword=sc.next();
            if (password.equals(againPassword)){
                System.out.println("密码设置成功！请输入其他信息");
                break;
            }
            else{
                System.out.println("您输入的密码有误，请重新输入！");
                continue;
            }
        }
        String idCard;
        while (true){
            System.out.println("请输入您的身份证号");
            idCard=sc.next();
            boolean flag=rightidCard(idCard);
            if(!flag) {
                System.out.println("您的身份证号输入不对，请重新输入！");
                continue;
            }
            else{
                System.out.println("身份证号验证成功，请输入其他信息！");
                break;
            }
        }
        //4.验证手机号。
        String phoneNo;
        while (true){
            System.out.println("请输入您的手机号！");
            phoneNo=sc.next();
            boolean flag=rightphoneno(phoneNo);
            if(flag) {
                System.out.println("身份证验证成功！");
                break;
            }
            else{
                System.out.println("验证失败，请重新输入身份证号！");
                continue;
            }
        }
        System.out.println("注册成功！");
        //5.将信息添加到集合。
        user_ user=new user_(sb,password,idCard,phoneNo);
        list.add(user);
    }
    private static boolean rightphoneno(String phoneNo){
        int len=phoneNo.length();
        if(len!=11) return false;
        char beginch=phoneNo.charAt(0);
        if(beginch=='0') return false;
        for(int i=0;i<len;i++){
            char c=phoneNo.charAt(i);
            if(!(c>='0'&&c<='9')){
                return false;
            }
        }
        return true;
    }
    private static boolean rightidCard(String idCard) {
        int len=idCard.length();
        if (len!=18) return false;
        for (int i=0;i<len-1;i++)
        {
            char c=idCard.charAt(i);
            if(c=='0'&&i==0) return false;
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) return false;
        }
        char endChar=idCard.charAt(len-1);
        if((endChar>='0'&&endChar<='9')||endChar=='x'||endChar=='X'){
            return true;
        }
        else return false;
    }
    private static boolean contains(ArrayList<user_>list,String sb){
        for (user_ sc : list) {
            String user = sc.getName();
            if (user.equals(sb)) {
                return true;
            }
        }
        return  false;
    }
    private static boolean judgeuser(String sb){
        boolean flag=false;
        int len=sb.length();
        int num1=0,num2=0;
        if(len<3||len>15) return false;
        for (int i=0;i<sb.length();i++){
            char c=sb.charAt(i);
            if(!((c>='A'&&c<='Z')||(c>='a'&&c<='z')||(c>='0'&&c<='9')))  return false;
            if ((c>='A'&&c<='Z')||(c>='a'&& c<='z')){
                num1++;
            }
        }
        return num1>0;

    }
}
