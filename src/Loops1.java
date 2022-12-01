import java.util.Scanner;

public class Loops1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for (int i = 1; i < 11; i++){
            int result = N * i;
            System.out.println(N + "x" + i + "=" + result);
        }
    }
}
