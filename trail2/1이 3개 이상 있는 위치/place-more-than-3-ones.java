import java.util.Scanner;
public class Main {

    public static int N;
    
    public static int[][] arr;

    public static int dx[] = {0, 1, 0, -1};
    public static int dy[] = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (countNum(i, j))
                    count++;
            }
        }

        System.out.print(count);
    }

    public static boolean inRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N)
            return true;
        return false;
    }

    public static boolean countNum(int x, int y) {
        int count = 0, nx, ny;

        for (int dirNum = 0; dirNum < 4; dirNum++) {
            nx = x + dx[dirNum];
            ny = y + dy[dirNum];
            if (inRange(nx, ny) && arr[nx][ny] == 1) {
                count++;
            }
        }

        if (count >= 3) {
            return true;
        }
        return false;
    }
}