import java.util.Scanner;

public class Main {

    public static int[] month = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt(); // m1월 d1일

        int m2 = sc.nextInt();
        int d2 = sc.nextInt(); // m2월 d2일

        int totalDays1 = totalDays(m1, d1);
        int totalDays2 = totalDays(m2, d2);

        System.out.print(totalDays2 - totalDays1 + 1);

    }

    public static int totalDays(int m1, int m2) {
        int total = 0;
        for (int i = 1; i < m1; i++) {
            total += month[i];
        }
        return total + m2;
    }
}
