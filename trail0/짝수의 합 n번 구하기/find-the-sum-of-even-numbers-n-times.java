import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int total = 0;
            for (int p = a; p <= b; p++) {
                if (p % 2 == 0) {
                    total += p;
                }
            }
            System.out.println(total);
        }
    }
}