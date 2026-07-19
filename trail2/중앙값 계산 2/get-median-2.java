import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int MAX_N = 100;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[MAX_N];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(printMiddleNum(arr, i) + " ");
            }
        }
    }

    public static int printMiddleNum(int[] arr, int n) {
        Arrays.sort(arr, 0, n + 1);
        return arr[n / 2];
    }
}