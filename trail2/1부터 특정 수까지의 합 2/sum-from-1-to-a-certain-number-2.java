import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = addNum(N);

        System.out.print(result);
    }

    public static int addNum(int n) {
        if (n == 1) {
            return 1;
        }

        return addNum(n - 1) + n;
    }
}