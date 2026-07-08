import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        findGCD(n, m);
    }

    public static void findGCD(int n, int m) {

        int gcd = 0;
        for (int i = 1; i != n + 1 && i != m + 1; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        System.out.print(gcd);
    }
}