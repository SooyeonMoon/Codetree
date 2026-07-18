import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        
        int count = 1;
        System.out.print(maximumNum(arr, n));
    }

    public static int maximumNum(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        }

        int n1 = maximumNum(arr, n - 1);

        if (n1 > arr[n - 1]) {
            return n1;
        }
        else {
            return arr[n - 1];
        }
    }
}