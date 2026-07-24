import java.util.Scanner;

public class Main {

    public static int[] arr = new int[200]; // 0으로 자동 초기화됨

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            countBlock(x1 + 100, x2 + 100);
        }

        int max = maxBlock();
        System.out.print(max);
    }

    public static void countBlock(int x1, int x2) {
        for (int i = x1; i < x2; i++) {
            arr[i]++;
        }
    }

    public static int maxBlock() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}