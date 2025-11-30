import java.util.Scanner;

public class userLogin {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String right_username = "hdxtg";
       String right_password = "123456";
       System.out.println("请输入账户");
       String username =sc.next();
       System.out.println("请输入密码");
       String password =sc.next();

       if (username.equals(right_username) && password.equals(right_password)) {
           System.out.println("成功登录");
       }else{
           System.out.println("账号或密码错误");
        }
    }
}
