import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    //属性
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
    String key;
    String details = "----------零钱通明细----------";
    double money;
    double balance = 0;
    Date date = null;// date 是 java.util.Date 类型，表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String note;
    String choice;
    double expense;

    //main方法
    public static void main(String[] args) {
        SmallChangeSysOOP smallChangeSys_oop = new SmallChangeSysOOP();
        smallChangeSys_oop.mainMenu();
    }

    //主方法
    public void mainMenu() {
        do {
            System.out.println("\n===========零钱通菜单==========");
            System.out.println("\t\t1  零钱通明细");
            System.out.println("\t\t2  收益入账");
            System.out.println("\t\t3  消费");
            System.out.println("\t\t4  退     出");
            System.out.println("请选择1-4：");
            key = scanner.next();
            switch (key) {
                case "1":
                    detail();
                    break;
                case "2":
                    income();
                    break;
                case "3":
                    pay();
                    break;
                case "4":
                    exit();
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
            }
        } while (loop);
        System.out.println("----------您已退出零钱通----------");
    }

    //辅助方法
    public void detail() {
        System.out.println(details);
        return;
    }

    public void income() {
        System.out.println("收益金额：");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("收益金额应该大于0");
            return;//退出switch语句，直接退出，不执行2下面的了
        }
        balance += money;
        date = new Date();//重新获取当前日期
        details += "\n" + "收益入账" + "\t+" + money + "\t" + sdf.format(date) + "\t" + "余额：" + balance;
    }

    public void pay() {
        System.out.println("消费金额：");
        expense = scanner.nextDouble();
        if (expense <= 0) {
            System.out.println("消费金额应该大于0");
            return;
        }
        if (expense > balance) {
            System.out.println("余额不足，你的消费金额不能超过" + balance);
            return;
        }
        System.out.println("消费说明：");
        note = scanner.next();
        date = new Date();
        balance -= expense;
        details += "\n" + note + "\t" + "-" + expense + "\t" + sdf.format(date) + "\t" + "余额：" + balance;
    }

    public void exit() {
        do {
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if (choice.equals("y")) {
                loop = false;
                break;
            } else if (choice.equals("n")) {
                break;
            }
        }
        while (true);
    }
}
