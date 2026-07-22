import java.util.Scanner;
public class Main {

    public static int[] month = new int[] {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String[] day = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        String A = sc.next();
        int p = -1;
        for (int i = 0; i < day.length; i++) {
            if (day[i].equals(A)) {
                p = i;
                break;
            }
        }
        // System.out.println(p);

        int days = getDays(m2, d2) - getDays(m1, d1);
        // System.out.println(days);
        int count = 0;
        while (days >= p) {
            count++;
            days -= 7;
        }
        System.out.print(count);
    }

    public static int getDays(int m, int d) {
        int total = 0;
        for (int i = 1; i < m; i++) {
            total += month[i];
        }
        total += d;

        return total;
    }
}