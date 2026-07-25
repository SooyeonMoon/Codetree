import java.util.Scanner;

public class Main {

    public static int N = 3;
    public static int OFFSET = 1000;
    public static int MAX_N = 2000;

    public static int[] x1 = new int[N];
    public static int[] y1 = new int[N];
    public static int[] x2 = new int[N];
    public static int[] y2 = new int[N];

    public static int[][] arr = new int[MAX_N + 1][MAX_N + 1];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();

            x1[i] += OFFSET;
            y1[i] += OFFSET;
            x2[i] += OFFSET;
            y2[i] += OFFSET;
        }

        for (int i = 0; i < N; i++) {
            for (int a = x1[i]; a < x2[i]; a++) {
                for (int b = y1[i]; b < y2[i]; b++) {
                    arr[a][b] = i + 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1 || arr[i][j] == 2) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}