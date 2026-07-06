import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];

        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
        }

        int total_3 = 0;
        int total_5 = 0;

        for (int i = 0; i < 10; i++) {
            if (A[i] % 3 == 0) {
                total_3++;
            }
            if (A[i] % 5 == 0) {
                total_5++;
            }
        }
        System.out.print(total_3 + " " + total_5);
    }
}