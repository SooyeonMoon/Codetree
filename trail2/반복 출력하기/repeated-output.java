import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printString(N);
    }

    static void printString(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("12345^&*()_");
        }
    }
}