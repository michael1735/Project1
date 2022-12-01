import java.util.Scanner;

public class StdinOrOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
         */
        // 这上面无法nextLine()无法输入的原因是他nextLine()方法已经从nextDouble()接受了\n作为字符串
        // 解决方法是中间再加一个nextLine()来接受\n
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String acceptor = scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
