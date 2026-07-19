import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int i;
        for (i = 0; i < n; i++) {
            if (A[i] != B[i]) {
                System.out.print("No");
                break;
            }
        }

        if (i == n) {
            System.out.print("Yes");
        }
    }
}