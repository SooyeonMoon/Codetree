import java.util.Scanner;
public class Main {

    public static final int MAX_K = 100000;

    public static int[] a = new int[2 * MAX_K + 1]; // 해당 위치 색깔 저장
    public static int[] cntW = new int[2 * MAX_K + 1];
    public static int[] cntB = new int[2 * MAX_K + 1];
    public static int w, b, g;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cur = MAX_K;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') { // 왼쪽으로 이동
                while (x-- > 0) {
                    a[cur] = 1; // 현재 해당 위치 color : white
                    cntW[cur]++; // 해당 위치(cur)에 white이 몇 번 됐는지
                    if (x > 0) {
                        cur--; // 왼쪽으로 인덱스 이동
                    }
                }
            }
            else {
                while (x-- > 0) { 
                    a[cur] = 2; // 현재 해당 위치 color : black
                    cntB[cur]++; // 해당 위치(cur)에 black이 몇 번 됐는지
                    if (x > 0) {
                        cur++; // 오른쪽으로 인덱스 이동
                    }
                }
            }
        }
        // Please write your code here.
        for (int i = 1; i <= 2 * MAX_K; i++) {
                if (cntW[i] >= 2 && cntB[i] >= 2) { // 해당 위치는 흰, 검 각각 2번 씩 색칠됨
                    g++;
                }
                else if (a[i] == 1) // 해당 위치 색 : white
                    w++;
                else if (a[i] == 2) // 해당 위치 색 : black
                    b++;
            }

            System.out.print(w + " " + b + " " + g);
    }
}