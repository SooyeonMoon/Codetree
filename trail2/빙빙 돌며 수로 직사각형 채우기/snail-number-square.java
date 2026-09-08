import java.util.Scanner;
public class Main {

    public static int MAX_N = 100;
    public static int MAX_M = 100;
    public static int n;
    public static int m;

    public static int[][] answer = new int[MAX_N][MAX_M];

    public static int x = 0, y = 0; // 첫 시작 위치 (0, 0)
    public static int dirNum = 0; // 첫 이동방향 : 오른쪽

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        answer[x][y] = 1;
        int nx, ny;

        for (int i = 2; i <= n * m; i++) {
            nx = x + dx[dirNum];
            ny = y + dy[dirNum];

            if (!inRange(nx, ny) || answer[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;
                // System.out.println(dirNum);
            }
            x = x + dx[dirNum];
            y = y + dy[dirNum];
            answer[x][y] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
}