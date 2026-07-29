import java.util.Scanner;

public class Main {
    public static int[] dx = new int[] {1, 0, -1, 0};
    public static int[] dy = new int[] {0, -1, 0, 1};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int dirNum = 3;
        int posX = 0, posY = 0;
        
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'L') {
                dirNum = (dirNum + 3) % 4; //counterclockwise
            }
            else if (str.charAt(i) == 'R') {
                dirNum = (dirNum + 1) % 4; // clockwise
            }
            else { // str.charAt(i) == 'F'인 경우
                posX += dx[dirNum];
                posY += dy[dirNum];
            }
        }

        

        System.out.print(posX + " " + posY);
    }
}