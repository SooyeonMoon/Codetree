import java.util.Scanner;

public class Main {
    public static int OFFSET = 100;
    public static int MAX_N = 10;

    public static int[] x1 = new int[MAX_N];
    public static int[] y1 = new int[MAX_N];
    public static int[] x2 = new int[MAX_N];
    public static int[] y2 = new int[MAX_N];

    public static int[][] arr = new int[2 * OFFSET][2 * OFFSET];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();

            x1[i] += OFFSET;
            y1[i] += OFFSET;
            x2[i] += OFFSET;
            y2[i] += OFFSET;
        }

        for (int i = 0; i < n; i++) {
            for (int a = x1[i]; a < x2[i]; a++) {
                for (int b = y1[i]; b < y2[i]; b++) {
                    arr[a][b] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 2 * OFFSET; i++) {
            for (int j = 0; j < 2 * OFFSET; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}