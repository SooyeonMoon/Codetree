import java.util.Scanner;

public class Main {

    public static int dx[] = {0, 1, 0, -1};
    public static int dy[] = {1, 0, -1, 0};

    public static int cNum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.

        int x = 0, y = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                cNum = (cNum + 3) % 4;
            }
            else if (s.charAt(i) == 'R') {
                cNum = (cNum + 1) % 4;
            }
            else {
                x += dx[cNum];
                y += dy[cNum];
            }
        }

        System.out.print(x + " " + y);
    }
}