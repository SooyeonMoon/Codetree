import java.util.Scanner;
public class Main {
    public static final int MAX_N = 100;
    public static int n1;
    public static int n2;

    public static int[] a = new int[MAX_N];
    public static int[] b = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        // Please write your code here.

        if (isSubsequence()) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }

    public static boolean isSubsequence() {
        if (n1 < n2) {
            return false;
        }
        else {
            for (int i = 0; i <= n1 - n2; i++) {
                if (isSame(i)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean isSame(int n) {
        for (int i = 0; i < n2; i++) {
            if (a[i + n] != b[i]) {
                return false;
            }
        }
        return true;
    }
}