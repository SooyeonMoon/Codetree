import java.util.Scanner;

public class Main {

    public static final int OFFSET = 100;
    public static final int MAX_N = 200;
    public static final int MAX_K = 100;

    public static int[] x1 = new int[MAX_K];
    public static int[] y1 = new int[MAX_K];

    public static int[][] checked = new int[MAX_N + 1][MAX_N + 1];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();

            x1[i] += OFFSET;
            y1[i] += OFFSET;
        }

        for (int i = 0; i < N; i++) {
            for (int a = x1[i]; a < x1[i] + 8; a++) {
                for (int b = y1[i]; b < y1[i] + 8; b++) {
                    checked[a][b] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < checked.length; i++) {
            for (int j = 0; j < checked.length; j++) {
                if (checked[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}