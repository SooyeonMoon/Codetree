import java.util.Scanner;

public class Main {
    public static int MAX_N = 1000;
    
    public static int[] arr = new int[MAX_N];
    public static int[] count = new int[MAX_N];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0)
                count[cnt]++;
            else if (arr[i] > 0 && arr[i - 1] > 0)
                count[cnt]++;
            else if (arr[i] < 0 && arr[i - 1] < 0)
                count[cnt]++;
            else
                count[++cnt]++;
        }

        int max = count[0];
        for (int i = 1; i < cnt; i++) {
            if (max < count[i])
                max = count[i];
        }
        System.out.print(max);
    }
}