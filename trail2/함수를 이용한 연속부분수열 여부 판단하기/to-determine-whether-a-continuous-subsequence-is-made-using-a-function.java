import java.util.Scanner;
public class Main {
    public static int MAX_N = 100;

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

        if (isPartSequence()) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }

    public static boolean isPartSequence() {
        for (int i = 0; i <= n1 - n2; i++) {
            if (isPart(i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPart(int n) {
        for (int i = 0; i < n2; i++) {
            if (a[i + n] != b[i]) {
                return false;
            }
        }
        return true;
    }
}