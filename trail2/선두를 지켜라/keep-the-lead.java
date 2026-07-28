import java.util.Scanner;

public class Main {
    public static int MAX_N = 1000000;
    public static int MAX_M = 1000000;

    public static int[] location_A = new int[MAX_N + 1];
    public static int[] location_B = new int[MAX_M + 1];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // A의 이동 횟수
        int m = sc.nextInt(); // B의 이동 횟수

        int timeA = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int a = 0; a < t; a++) {
                location_A[timeA] = location_A[timeA - 1] + v;
                // System.out.print(location_A[timeA] + " ");
                timeA++;
            }
        }
        // System.out.println();

        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int a = 0; a < t; a++) {
                location_B[timeB] = location_B[timeB - 1] + v;
                // System.out.print(location_B[timeB] + " ");
                timeB++;
            }
        }
        // System.out.println();

        // A가 리더면 1, B가 리더면 2로 관리합니다.
        int leader = 0, count = 0;
        for (int i = 1; i < timeA; i++) {
            if (location_A[i] > location_B[i]) {
                if (leader == 2) {
                    count++;
                }
                leader = 1;
            }
            else if (location_A[i] < location_B[i]) {
                if (leader == 1) {
                    count++;
                }
                leader = 2;
            }
        }
        System.out.print(count);
    }
}