import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printText(N);
    }

    public static void printText(int n) {
        if (n == 0) {
            return;
        }

        printText(n - 1); // 1부터 n-1번 째를 출력하게 함
        System.out.println("HelloWorld");
    }
}