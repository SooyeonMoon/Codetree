import java.util.Scanner;

public class Main {

    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        System.out.print(F(n - 1));
    }

    public static int F(int n) {
        if (n == 0) {
            return arr[0];
        }

        int a = arr[n];
        int b = F(n - 1);

        return (a * b) / findNum(a, b);
    }

    public static int findNum(int a, int b) {
        if (b > 0) {
            return findNum(b, a % b);
        }
        return a;
    }
}