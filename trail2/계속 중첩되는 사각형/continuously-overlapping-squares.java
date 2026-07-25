import java.util.Scanner;

public class Main {

    public static int N = 10;
    public static int OFFSET = 100;
    public static int MAX_K = 2000;

    public static int[] x1 = new int[N];
    public static int[] y1 = new int[N];
    public static int[] x2 = new int[N];
    public static int[] y2 = new int[N];

    public static int[][] color = new int[MAX_K + 1][MAX_K + 1];

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
                    if (i % 2 == 0) {
                        color[a][b] = 1;
                    }
                    else {
                        color[a][b] = 2;
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < color.length; j++) {
                if (color[i][j] == 2)
                    count++;
            }
        }
        System.out.print(count);
    }
}