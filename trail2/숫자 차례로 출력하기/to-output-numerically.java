import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printNum(N);
        System.out.println();
        printReversedNum(N);
    }

    public static void printNum(int n) {
        if (n == 0) {
            return;
        }

        printNum(n - 1);
        System.out.print(n + " ");
    }

    public static void printReversedNum(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printReversedNum(n - 1);
    }
}