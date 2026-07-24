import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt(); // k번 반복

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt(); // i번째 칸
            int b = sc.nextInt(); // k번째 칸
            addBlock(arr, a, b);
        }

        int max = findMaxBlock(arr);
        System.out.print(max);
    }

    public static void addBlock(int[] arr, int a, int b) {
        for (int i = a - 1; i < b; i++) {
            arr[i]++;
        }
    }

    public static int findMaxBlock(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}