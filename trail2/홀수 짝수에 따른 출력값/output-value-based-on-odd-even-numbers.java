import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(calculate(N));
    }

    public static int calculate(int n) {
        if (n == 1) {
            return 1;
        }
        
        if (n == 2) {
            return 2;
        }

        return calculate(n - 2) + n;
    }
}