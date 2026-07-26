import java.util.Scanner;
public class Main {
    public static int MAX_R = 100;

    public static int[] array = new int[MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }
        // Please write your code here.
        for (int i = 0; i < n; i++) {
            for (int a = start[i]; a <= end[i]; a++) {
                array[a]++;
            }
        }
        
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.print(max);
    }
}