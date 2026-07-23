import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] str = new int[5000];
        int cnt = 0;

        while (true) {
            if (n < 2) {
                str[cnt++] = n;
                break;
            }

            str[cnt++] = n % 2;
            n /= 2;
        }

            for (int i = cnt - 1; i >= 0; i--) {
                System.out.print(str[i]);
            }
    }
}