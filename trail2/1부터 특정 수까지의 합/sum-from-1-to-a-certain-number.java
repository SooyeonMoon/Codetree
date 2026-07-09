import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = add(N);
        System.out.print(result);
    }

    public static int add(int N) {
        
        int total = 0;
        for (int i = 1; i <= N; i++) {
            total += i;
        }

        return total / 10;
    }
}