import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = productNum(N);

        System.out.print(result);
    }

    public static int productNum(int n) {
        if (n < 10) {
            return n * n;
        }

        return productNum(n / 10) + (n % 10) * (n % 10);
    }
}