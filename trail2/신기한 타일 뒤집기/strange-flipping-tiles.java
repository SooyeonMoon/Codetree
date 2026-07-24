import java.util.Scanner;

public class Main {

    public static int MAX_K = 100000;

    public static int[] a = new int[2 * MAX_K + 1];
    public static int[] cntL = new int[2 * MAX_K + 1];
    public static int[] cntR = new int[2 * MAX_K + 1];

    public static int w, b;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n번의 명령 반복
        int cur = MAX_K;
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') {
                while (x-- > 0) {
                    a[cur] = 1; // 현재 타일 color : white
                    if (x > 0) { // 왼쪽 이동
                        cur--;
                    }
                }
            }

            if (d == 'R') {
                while (x-- > 0) {
                    a[cur] = 2; // 현재 타일 color : black
                    if (x > 0) { // 오른쪽 이동
                        cur++;
                    }
                }
            }
        }

        for (int i = 1; i <= 2 * MAX_K; i++) {
            if (a[i] == 1) {
                w++;
            }
            if (a[i] == 2) {
                b++;
            }
        }

        System.out.print(w + " " + b);
    }
}