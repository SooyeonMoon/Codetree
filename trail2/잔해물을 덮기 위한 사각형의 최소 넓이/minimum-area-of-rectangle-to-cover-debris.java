import java.util.Scanner;

public class Main {

    public static int OFFSET = 1000;
    public static int MAX_N = 2000;
    public static int N = 2;

    public static int[] x1 = new int[N];
    public static int[] y1 = new int[N];
    public static int[] x2 = new int[N];
    public static int[] y2 = new int[N];

    public static int[][] checked = new int[MAX_N + 1][MAX_N + 1];

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

        int flag = 0;
        // 1
        if (x2[1] > x1[0] && x2[1] < x2[0]) {
            if (y1[1] > y1[0] && y1[1] < y2[0])
                flag = 1;
        }
        // 2
        if (x1[1] > x1[0] && x1[1] < x2[0]) {
            if (y1[1] > y1[0] && y1[1] < y2[0])
                flag = 1;
        }
        // 3
        if (x1[1] > x1[0] && x1[1] < x2[0]) {
            if (y2[1] > y1[0] && y2[1] < y2[0])
                flag = 1;
        }
        // 4
        if (x2[1] > x1[0] && x2[1] < x2[0]) {
            if (y2[1] > y1[0] && y2[1] < y2[0])
                flag = 1;
        }
        //5
        if (x1[1] < x1[0] && x2[0] < x2[1]) {
            if (y1[1] > y1[0] && y2[1] < y2[0])
                flag = 1;
        }
        

        for (int i = 0; i < N; i++) {
            for (int a = x1[i]; a < x2[i]; a++) {
                for (int b = y1[i]; b < y2[i]; b++) {
                    checked[a][b] = i + 1;
                }
            }
        }

        int count = 0;
        if (flag == 1) {
            count = (x2[0] - x1[0]) * (y2[0] - y1[0]);
        }
        else {
            for (int i = 0; i < checked.length; i++) {
                for (int j = 0; j < checked.length; j++) {
                    if (checked[i][j] == 1) {
                        count++;
                    }
                }
            }
        }
        
        System.out.print(count);
    }
}