import java.util.Scanner;
public class Main {

    public static int dx[] = {1, 0, -1, 0};
    public static int dy[] = {0, -1, 0, 1};

    public static char dir[] = {'E', 'S', 'W', 'N'};

    public static int x = 0;
    public static int y = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n번 이동
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please write your code here.

            if (direction == 'E') {
                x += distance;
            }
            else if (direction == 'S') {
                y -= distance;
            }
            else if (direction == 'W') {
                x -= distance;
            }
            else {
                y += distance;
            }

        }

        System.out.print(x + " ");
        System.out.print(y);
    }
}