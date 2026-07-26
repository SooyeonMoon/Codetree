import java.util.Scanner;

public class Main {
    public static int MAX_N = 1000;

    public static int[] arr = new int[MAX_N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // Please write your code here.

        int max = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (i >= 1 && arr[i] > arr[i - 1])
                cnt++;
            else
                cnt = 1;
            
            max = Math.max(max, cnt);
        }
        System.out.print(max);
    }
}