import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] A = new int[10];
        A[0] = a;
        A[1] = b;

        for (int i = 2; i < 10; i++) {
            A[i] = (A[i - 1] + A[i - 2]) % 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(A[i] + " ");
        }
    }
}