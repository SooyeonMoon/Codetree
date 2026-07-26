import java.util.Scanner;
public class Main {

    public static int MAX_N = 1000;
    public static int MAX_R = 200000;
    public static int OFFSET = 100000;

    public static int[] array = new int[MAX_R + 1];
    public static int[] cntW = new int[MAX_R + 1];
    public static int[] cntB = new int[MAX_R + 1];

    public static int w, b, g;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cur = OFFSET;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') {
                while (x-- > 0) {
                    array[cur] = 1; // color : white
                    cntW[cur]++; // how many times this tile be white
                    if (x > 0) {
                        cur--;
                    }
                }
            }
            else {
                while (x-- > 0) {
                    array[cur] = 2; // color : black
                    cntB[cur]++;
                    if (x > 0) {
                        cur++;
                    }
                }
            }
        }
        // Please write your code here.
        for (int i = 0; i < array.length; i++) {
            if (cntW[i] >= 2 && cntB[i] >= 2) {
                g++;
            }
            else if (array[i] == 1) {
                w++;
            }
            else if (array[i] == 2) {
                b++;
            }
        }

        System.out.print(w + " " + b + " " + g);
    }
}