import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int cnt = 0;
        for (int i = A; i <= B; i++) {
            if (isKeyNum(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    public static boolean isKeyNum(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

            if ((n / 10 + n % 10) % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}