import java.util.Scanner;

public class Main {
    public static int n;

    public static int[] dx = new int[] {0, 1, 0, -1};
    public static int[] dy = new int[] {1, 0, -1, 0};
    public static int[][] count;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int x = 0, y = 0;
        int cnt = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int dirNum = 0; dirNum < 4; dirNum++) {
                    int nx = i + dx[dirNum], ny = j + dy[dirNum];

                    if (isRange(nx, ny) && array[nx][ny] == 1) {
                        cnt++;
                    }
                }
                if (cnt >= 3) { // 상하좌우 1인 개수가 3 이상이면
                    // System.out.println(i + " " + j);
                    ans++;
                }
                cnt = 0; // 상하좌우 확인용 변수 초기화
            }
        }
        System.out.print(ans);
    }

    public static boolean isRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
}