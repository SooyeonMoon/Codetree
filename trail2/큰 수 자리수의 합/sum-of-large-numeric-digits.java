import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        int num = a * b * c;

        System.out.print(F(num));
    }

    public static int F(int n) {
        if (n < 10) {
            return n;
        }
        return F(n / 10) + n % 10;
    }
}