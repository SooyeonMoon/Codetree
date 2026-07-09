import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = findMin(a, b, c);

        System.out.print(min);
    }

    public static int findMin(int a, int b, int c) {
        int min = a;

        if (min > b) {
            min = b;
            if (min > c) {
                return c;
            }
            else {
                return b;
            }
        }
        else if (min > c) {
            return c;
        }
        else {
            return a;
        }
    }
}