@SuppressWarnings("ConstantConditions")     //消除警告
public class StringDemo1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 ="ABC";
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}