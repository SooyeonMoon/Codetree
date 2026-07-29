import java.util.Scanner;

public class Main {
    public static int n;

    public static int[] dx = new int[] {0, 1, -1, 0};
    public static int[] dy = new int[] {1, 0, 0, -1};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 격자 크기 n * n
        int t = sc.nextInt(); // 움직이는 시간 t초

        int x = sc.nextInt() - 1; // x행은 격자상에서 (x - 1)행
        int y = sc.nextInt() - 1; // y열은 격자상에서 (y - 1)열
        char d = sc.next().charAt(0); // 어느 방향으로 이동할 것인지

        int dirNum = moveDirection(d);
        // System.out.println(dirNum);

        int nx, ny;
        for (int i = 0; i < t; i++) {
            x = x + dx[dirNum];
            y = y + dy[dirNum];

            if (!inRange(x, y)) {
                dirNum = 3 - dirNum;
                x = x + dx[dirNum];
                y = y + dy[dirNum];
                // System.out.println(dirNum);
            }
        }
        System.out.print((x + 1) + " " + (y + 1));
    }

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static int moveDirection(char d) {
        if (d == 'R')
            return 0;
        else if (d == 'D')
            return 1;
        else if (d == 'U')
            return 2;
        else
            return 3;
    }
}