import java.util.Scanner;
public class Main {

    public static int[] a;
    public static int[] b;

    public static int n1;
    public static int n2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        a = new int[n1];
        b = new int[n2];

        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.

        if (isSequence()) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }

    public static boolean isSequence() {
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