import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int cnt = 0;
        for (int i = A; i <= B; i++) {
            if (findNum(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    public static boolean findNum(int n) {
        return n % 3 == 0 || checkNumber(n);
    }

    public static boolean checkNumber(int n) {
        while (n > 0) {
            if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}