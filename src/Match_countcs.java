//如果一个 MP3 文件占用磁盘的大小是 4MB
// 小蓝的硬盘还剩下 100GB 的空间
// 请问他还可以放多少个这样的 MP3 文件？

public class Match_countcs {
    public static void main(String[] args) {
        int mp3 = 4;
        int yp = 1024000;
        System.out.println(yp / mp3);
    }
}




