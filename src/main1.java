import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 成绩评定系统 ===");
        System.out.print("请输入你的成绩（0-100）：");

        // 输入验证
        if (sc.hasNextInt()) {
            int score = sc.nextInt();

            // 成绩范围验证
            if (score >= 0 && score <= 100) {
                // 成绩评定
                if (score >= 60) {
                    System.out.println("✅ 考试通过，恭喜！");
                } else {
                    System.out.println("❌ 考试没有通过，下次努力！");
                }

                // 额外反馈
                if (score >= 90) {
                    System.out.println("🌟 优秀！继续保持！");
                } else if (score >= 80) {
                    System.out.println("👍 良好！还有进步空间！");
                } else if (score >= 60) {
                    System.out.println("💪 及格！继续加油！");
                }
            } else {
                System.out.println("❌ 输入错误：成绩必须在0-100之间！");
            }
        } else {
            System.out.println("❌ 输入错误：请输入有效的整数成绩！");
        }

        sc.close();
    }
}