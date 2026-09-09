import java.util.Scanner;

public class Main {

    public static int MAX_N = 100;
    public static int n;

    public static int[][] arr = new int[MAX_N][MAX_N]; // 0으로 초기화 된 2차원 배열

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] points = new int[m][2]; // 색칠할 위치 저장
        
        for (int i = 0; i < m; i++) {
            points[i][0] = sc.nextInt() - 1;
            points[i][1] = sc.nextInt() - 1;

            arr[points[i][0]][points[i][1]] = 1;

            boolean status = checkStatus(points[i][0], points[i][1]);
            if (status)
                System.out.println(1);
            else
                System.out.println(0);
        }

        // Please write your code here.
    }

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static boolean checkStatus(int x, int y) {
        int nx, ny, count = 0;
        for (int i = 0; i < 4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
            if (inRange(nx, ny) && arr[nx][ny] == 1) {
                count++;
            }
        }
        // System.out.println("count = " + count + "\n");
        if (count == 3)
            return true;
        else
            return false;
    }
}