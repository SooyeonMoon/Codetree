import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String num = findNum(n);

        System.out.print(num);
    }

    public static String findNum(int n) {
        if (n < 10) {
            return "No";
        }
        else {
            if (n % 2 != 0) {
                return "No";
            }
            else {
                int num = n / 10 + n % 10;
                if (num % 5 != 0 ) {
                    return "No";
                }
                else {
                    return "Yes";
                }
            }
        }
    }
}