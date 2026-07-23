import java.util.Scanner;
public class Main {

    public static String[] days = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri" ,"Sat", "Sun"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int result = calculateDays(m2, d2) - calculateDays(m1, d1);
        while (result < 0) {
            result += 7;
        }
        result %= 7;
        System.out.print(days[result]);
    }

    public static int calculateDays(int m, int d) {
        int[] month = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int total = 0;
        for (int i = 1; i < m; i++) {
            total += month[i];
        }
        total += d;

        return total;
    }
}