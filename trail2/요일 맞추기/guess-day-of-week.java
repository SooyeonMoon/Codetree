import java.util.Scanner;

public class Main {

    public static int[] month = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] day = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int days = getDays(m1, d1, m2, d2);
        // System.out.println(days);
        if (days < 0) {
            while (days < 0) {
                days += 7;
            }
        }
        days %= 7;
        System.out.print(day[days]);
    }

    public static int getDays(int m1, int d1, int m2, int d2) {
        int totalDays1 = 0;
        for (int i = 1; i < m1; i++) {
            totalDays1 += month[i];
        }
        totalDays1 += d1;
        // System.out.println(totalDays1);


        int totalDays2 = 0;
        for (int i = 1; i < m2; i++) {
            totalDays2 += month[i];
        }
        totalDays2 += d2;
        // System.out.println(totalDays2);

        return totalDays2 - totalDays1;
    }
}