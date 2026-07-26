import java.util.Scanner;
public class Main {
    public static int OFFSET = 1000;
    public static int MAX_R = 2000;
    public static int MAX_N= 100;

    public static int[] x1 = new int[MAX_N];
    public static int[] x2 = new int[MAX_N];

    public static int[] array = new int[MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cur = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            if (dir == 'L') {
                x1[i] = cur - x;
                x2[i] = cur;
                cur -= x;
            }
            else {
                x1[i] = cur;
                x2[i] = cur + x;
                cur += x;
            }

            x1[i] += OFFSET;
            x2[i] += OFFSET;
        }

        for (int i = 0; i < N; i++) {
            for (int a = x1[i]; a < x2[i]; a++) {
                array[a]++;
            }
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 2) {
                count++;
            }
        }
        System.out.print(count);
    }
}