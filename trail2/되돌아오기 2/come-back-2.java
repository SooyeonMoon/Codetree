import java.util.Scanner;
public class Main {

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static int x = 0, y = 0;

    public static int dirNum = 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        // Please write your code here.
        // System.out.println(commands.length());
        int count = 0, flag = 0;
        for (int i = 0; i < commands.length(); i++) {
            char d = commands.charAt(i);
            dirNum = getNum(d);

            count++;
            if (d == 'F') {
                x = x + dx[dirNum];
                y = y + dy[dirNum];
                // System.out.println(x + " " + y);

                if (x == 0 && y == 0) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 1) {
            System.out.print(count);
        }
        else {
            System.out.print(-1);
        }
    }

    public static int getNum(char d) {
        if (d == 'L')
            return (dirNum + 3) % 4;
        else if (d == 'R')
            return (dirNum + 1) % 4;
        else
            return dirNum; // F인 경우


        // dirNum = (dirNum + 1) % 4;
    }
}