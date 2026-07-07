import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] m = new int[N][N];

        int cnt = 1;
        for (int i = 0; i < N; i++) {
            if (cnt > N) {
                    for (int j = 0; j < N; j++) {
                        m[j][i] = --cnt;
                }
            }
            else {
                for (int j = 0; j < N; j++) {
                    m[j][i] = cnt++;
                }
            }
            
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}