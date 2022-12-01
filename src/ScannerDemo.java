import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string here: ");
        String str = scan.nextLine();
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter int here: ");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.print("Enter float here: ");
        float b = scan.nextFloat();
        System.out.println(b);
        scan.close();
        sc.close();
    }
}
