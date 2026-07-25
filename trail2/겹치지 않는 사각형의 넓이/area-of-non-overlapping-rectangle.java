import java.util.Scanner;

public class Main {

    public static int OFFSET = 1000;
    public static int MAX_N = 2000;

    public static int[] x1 = new int[MAX_N + 1];
    public static int[] y1 = new int[MAX_N + 1];
    public static int[] x2 = new int[MAX_N + 1];
    public static int[] y2 = new int[MAX_N + 1];

    public static int[][] arr = new int[MAX_N + 1][MAX_N + 1];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();

            x1[i] += OFFSET;
            y1[i] += OFFSET;
            x2[i] += OFFSET;
            y2[i] += OFFSET;
        }

        for (int i = 0; i < 2; i++) {
            for (int a = x1[i]; a < x2[i]; a++) {
                for (int b = y1[i]; b < y2[i]; b++) {
                    arr[a][b] = 1;
                }
            }
        }

        for (int i = x1[2]; i < x2[2]; i++) {
            for (int j = y1[2]; j < y2[2]; j++) {
                arr[i][j] = 0;
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}