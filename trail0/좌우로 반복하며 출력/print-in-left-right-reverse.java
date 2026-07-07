import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] m = new int[N];

        int cnt = 1;
        for (int i = 0; i < N; i++) {
            m[i] = cnt++;
        }

        for (int i = 0; i < N; i++) {
            if (i % 2 == 1) {
                for (int j = N - 1; j >= 0; j--) {
                    System.out.print(m[j]);
                }
                System.out.println();
            }
            else {
                for (int j = 0; j < N; j++) {
                    System.out.print(m[j]);
                }
                System.out.println();
            }
        }
    }
}