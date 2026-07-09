import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        System.out.print(checkYear(y));
    }

    public static boolean checkYear(int n) {
        if (n % 100 == 0 && n % 400 != 0) {
            return false;
        }
        if (n % 4 == 0) {
            return true;
        }
        return false;
    }
}