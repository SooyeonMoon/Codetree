import java.util.Scanner;
public class Main {

    public static int[] arr;
    public static int total = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n + 1]; // 인덱스 범위 : 0 ~ n
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int num = calculate(m);
        System.out.print(num);
    }

    public static int calculate(int m) {
        while (m >= 1) {
            total += arr[m];
            if (m % 2 == 0) {
                m /= 2;
            }
            else {
                m--; 
            }
        }
        return total;
    }
}