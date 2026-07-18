import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = F(n);

        System.out.print(result);
    }

    public static int F(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return F(n / 2) + 1;
        }
        else {
            return F(n / 3) + 1;
        }
    }
}