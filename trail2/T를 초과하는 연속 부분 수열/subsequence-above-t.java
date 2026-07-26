import java.util.Scanner;

public class Main {
    public static int MAX_N = 1000;

    public static int[] a = new int[MAX_N];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int max = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > t)
                cnt++;
            else
                cnt = 0;
            
            max = Math.max(max, cnt);
        }
        System.out.print(max);
    }
}