import java.util.Scanner;
public class Main {

    public static int[] arr;
    public static int num = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            num = calculate(a1, a2);
            System.out.println(num);
            num = 0;
        }
    }

    public static int calculate(int a1, int a2) {
        int result = 0;
        for (int i = a1; i <= a2; i++) {
            result += arr[i - 1];
        }
        return result;
    }
}