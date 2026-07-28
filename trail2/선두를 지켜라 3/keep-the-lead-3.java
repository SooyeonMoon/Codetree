import java.util.Scanner;

public class Main {
    public static int MAX_NUM = 1000000;

    public static int[] posA = new int[MAX_NUM + 1];
    public static int[] posB = new int[MAX_NUM + 1];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int timeA = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int a = 0; a < t; a++) {
                posA[timeA] = posA[timeA - 1] + v;
                timeA++;
            }  
        }

        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int a = 0; a < t; a++) {
                posB[timeB] = posB[timeB - 1] + v;
                timeB++;
            }
        }

        int leader = 0, count = 0;
        for (int i = 1; i <= timeA; i++) {
            if (posA[i] > posB[i]) {
                if (leader == 2) {
                    count++;
                }
                leader = 1;
            }
            else if (posB[i] > posA[i]) {
                if (leader == 1) {
                    count++;
                }
                leader = 2;
            }
            else if (posA[i] == posB[i]) {
                if (posA[i - 1] != posB[i - 1])
                    count++;
            }
        }
        System.out.print(count);
    }
}