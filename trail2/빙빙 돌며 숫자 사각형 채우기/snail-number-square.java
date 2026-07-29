import java.util.Scanner;
public class Main {
    public static int MAX_NUM = 100;

    public static int[][] arr = new int[MAX_NUM][MAX_NUM];
    public static int[] dx = new int[] {0, 1, 0, -1};
    public static int[] dy = new int[] {1, 0, -1, 0};

    public static int currX = 0, currY = 0; // 현재 위치
    public static int dirNum = 0; // 현재 방향
    public static int n, m; // 2차원 배열 크기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        arr[currX][currY] = 1;

        for (int i = 2; i <= n * m; i++) {
            int nextX = currX + dx[dirNum], nextY = currY + dy[dirNum];

            if (!inRange(nextX, nextY) || arr[nextX][nextY] != 0) {
                dirNum = (dirNum + 1) % 4;
            }

            currX = currX + dx[dirNum];
            currY = currY + dy[dirNum];
            arr[currX][currY] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
}