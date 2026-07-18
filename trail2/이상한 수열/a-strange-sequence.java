import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.print(F(n));
    }

    public static int F(int n) {
        if (n == 1) {
            return 1;
        }
        
        if (n == 2) {
            return 2;
        }

        return F(n / 3) + F(n - 1);
    }
}