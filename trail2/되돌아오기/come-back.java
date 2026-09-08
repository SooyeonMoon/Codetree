import java.util.Scanner;
public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static int x = 0, y = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] dir = new char[n];
        int[] dist = new int[n];
        for(int i = 0; i < n; i++){
            dir[i] = sc.next().charAt(0);
            dist[i] = sc.nextInt();
        }
        // Please write your code here.
        int count = 0, flag = 0;
        for (int i = 0; i < n; i++) {
            int dirNum = moveDir(dir[i]);
            // System.out.println(dirNum);
            for (int t = 0; t < dist[i]; t++) {
                x = x + dx[dirNum];
                y = y + dy[dirNum];
                // System.out.println(x + " " + y);
                count++;

                if (x == 0 && y == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1) {
                System.out.print(count);
                break;
            }
        }
        if (flag == 0) {
            System.out.print("-1");
        }
    }

    public static int moveDir(char d) {
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