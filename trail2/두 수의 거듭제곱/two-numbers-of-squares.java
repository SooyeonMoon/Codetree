import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = multipleNum(a, b);

        System.out.print(result);
    }

    public static int multipleNum(int a, int b) {

        int total = 1;
        for (int i = 1; i <= b; i++) {
            total *= a;
        }
        return total;
    }
}