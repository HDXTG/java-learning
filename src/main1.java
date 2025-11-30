import java.util.Scanner;

public class main1 {
    //编写一个main方法
    public static void main(String[] args) {
        //演示判断成绩是否通过的案例
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的成绩");
        int text =sc.nextInt();
        if(text >= 60) {
            System.out.println("考试通过，恭喜");
        } else {
            System.out.println("考试没有通过，下次努力");
        }
    }
}