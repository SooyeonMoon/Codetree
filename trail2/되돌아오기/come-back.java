import java.util.Scanner;

public class Main {
    public static int MAX_N = 1000;

    public static int[] dx = new int[] {1, 0, -1, 0};
    public static int[] dy = new int[] {0, -1, 0, 1};

    public static int[] posX = new int[MAX_N + 1];
    public static int[] posY = new int[MAX_N + 1];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int time = 1, flag = 0;
        for (int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int distance = sc.nextInt();

            int dirNum = moveDirection(d);
            for (int a = 0; a < distance; a++) {
                posX[time] = posX[time - 1] + dx[dirNum];
                posY[time] = posY[time - 1] + dy[dirNum];
                // System.out.println(posX[time] + " " + posY[time]);

                if (posX[time] == 0 && posY[time] == 0 && flag == 0) {
                    flag = time;
                }
                time++;
            }
        }
        if (flag != 0)
            System.out.print(flag);
        else
            System.out.print("-1");
    }

    public static int moveDirection(char d) {
        if (d == 'E')
            return 0;
        else if (d == 'S')
            return 1;
        else if (d == 'W')
            return 2;
        else
            return 3;
    }
}