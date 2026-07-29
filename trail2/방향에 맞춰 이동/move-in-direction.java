import java.util.Scanner;

public class Main {
    // public static int[] dx = new int[] {1, 0, -1, 0};
    // public static int[] dy = new int[] {0, -1, 0, 1};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int posX = 0, posY = 0;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int x = sc.nextInt();

            int key = fourDirection(d);
            
            if (key == 0)
                posX += x;
            else if (key == 1)
                posY -= x;
            else if (key == 2)
                posX -= x;
            else
                posY += x;
        }
        System.out.print(posX + " " + posY);
    }

    public static int fourDirection(char d) {
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