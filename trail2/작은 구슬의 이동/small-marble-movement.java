import java.util.Scanner;

public class Main {

    public static int N;

    public static int[] dx = {0, 1, -1, 0};
    public static int[] dy = {1, 0, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // N행 N열 배열
        int T = sc.nextInt(); // t초
        int R = sc.nextInt() - 1; // 초기에 R행
        int C = sc.nextInt() - 1; // C열
        char D = sc.next().charAt(0); // 구슬의 이동 방향
        // Please write your code here.
        int dirNum = getDir(D);
        int nx, ny;
        for (int i = 0; i < T; i++) {
            nx = R + dx[dirNum];
            ny = C + dy[dirNum];

            if (!inRange(nx, ny))
                dirNum = 3 - dirNum;
            else {
                R = R + dx[dirNum];
                C = C + dy[dirNum];
            }
        }

        System.out.print((R + 1) + " " + (C + 1));
    }

    public static int getDir(char D) {
        if (D == 'R')
            return 0;
        else if (D == 'D')
            return 1;
        else if (D == 'U')
            return 2;
        else
            return 3;
    }

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N);
    }
}