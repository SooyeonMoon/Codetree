import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printNum(N);
    }

    public static void printNum(int N) {

        int cnt = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(cnt + " ");
                cnt++;

                if (cnt == 10) {
                    cnt = 1;
                }
            }
            System.out.println();
        }
    }
}