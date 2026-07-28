import java.util.Scanner;

public class Main {
    public static int MAX_NUM = 2000000;

    public static int[] posA = new int[MAX_NUM + 1];
    public static int[] posB = new int[MAX_NUM + 1];

    public static int[] dirA = new int[MAX_NUM + 1];
    public static int[] dirB = new int[MAX_NUM + 1];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // A가 이동한 횟수
        int m = sc.nextInt(); // B가 이동한 횟수

        int timeA = 1;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') {
                for (int a = 0; a < t; a++) {
                    posA[timeA] = posA[timeA - 1] - 1;
                    dirA[timeA] = -1;
                    timeA++;
                }
            }
            else {
                for (int a = 0; a < t; a++) {
                    posA[timeA] = posA[timeA - 1] + 1;
                    dirA[timeA] = 1;
                    timeA++;
                }
            }
        }

        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') {
                for (int a = 0; a < t; a++) {
                    posB[timeB] = posB[timeB - 1] - 1;
                    dirB[timeB] = -1;
                    timeB++;
                }
            }
            else {
                for (int a = 0; a < t; a++) {
                    posB[timeB] = posB[timeB - 1] + 1;
                    dirB[timeB] = 1;
                    timeB++;
                }
            }
        }

        int count = 0;
        if (timeA < timeB) {
            for (int i = timeA; i <= timeB; i++) {
                posA[i] = posA[timeA - 1];
            }
        }
        else {
            for (int i = timeB; i <= timeA; i++) {
                posB[i] = posB[timeB - 1];
            }
        }

        int time = Math.max(timeA, timeB);
        for (int i = 1; i <= time; i++) {
            if (posA[i] == posB[i]) {
                if (posA[i - 1] != posB[i - 1])
                    count++;
            }
        }
        
        System.out.print(count);
    }
}