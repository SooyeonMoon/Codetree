import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int[] arr;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[2 * n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int result = minimumOfMax();
        System.out.print(result);
    }

    public static int minimumOfMax() {
        int max = arr[0] + arr[arr.length - 1];
        for (int i = 1; i < arr.length / 2; i++) {
            if (max < arr[i] + arr[arr.length - 1 - i]) {
                max = arr[i] + arr[arr.length - 1 - i];
            }
        }
        return max;
    }
}