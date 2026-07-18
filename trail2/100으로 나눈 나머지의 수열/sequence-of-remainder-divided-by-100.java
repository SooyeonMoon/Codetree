import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(findNum(n));
    }

    public static int findNum(int n) {
        if (n == 1) {
            return 2;
        }

        if (n == 2) {
            return 4;
        }

        return (findNum(n - 1) * findNum(n - 2)) % 100;
    }
}