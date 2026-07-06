import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = N - 1; i >= 0; i--) {
            if (A[i] % 2 == 0) {
                System.out.print(A[i] + " ");
            }
        }
    }
}