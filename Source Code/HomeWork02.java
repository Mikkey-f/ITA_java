package string_;

/**
 * @author 司志俊
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        String name = "szj";
        String pwd = "123456";
        String email = "2631725125@qq.com";
        try {
            userRegister(name,pwd,email);
            System.out.println("恭喜你注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userRegister(String name,String pwd,String email){
        int i = name.length();
        if (!(i>=2 && i<=4)){
            throw new RuntimeException("用户名的长度为2，3，4");
        }

        if (!(pwd.length() == 6 && isDigital(pwd))){
            throw new RuntimeException("密码的长度为6，要求全是数字");
        }

        int x = email.indexOf('@');
        int y = email.indexOf('.');
        if (!(x>0 && y>x)){
            throw new RuntimeException("邮箱中包含@和.  并且@在.的前面");
        }

    }

    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
