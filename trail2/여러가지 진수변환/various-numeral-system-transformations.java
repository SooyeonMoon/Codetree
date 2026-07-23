import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정수 N
        int b = sc.nextInt(); // 바꿀 진수 B

        int[] arr = new int[20];
        int cnt = 0;
        while (true) {
            if (n < b) {
                arr[cnt++] = n;
                break;
            }

            arr[cnt++] = n % b;
            n /= b;
        }
        
        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}