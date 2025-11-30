import java.util.Scanner;

public class userLogin {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String right_username = "hdxtg";
       String right_password = "123456";

        for (int i = 0; i < 3; i++) {

       System.out.println("请输入账户");
       String username =sc.next();
       System.out.println("请输入密码");
       String password =sc.next();

            if (username.equals(right_username) && password.equals(right_password)) {
                System.out.println("登录成功");
            }else{
                System.out.println("账号或密码错误" + "您还剩下" + (2 - i) + "次机会");
            }
        }

    }
}
