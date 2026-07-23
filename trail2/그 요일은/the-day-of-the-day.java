import java.util.Scanner;
public class Main {

    public static String[] days = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri" ,"Sat", "Sun"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String A = sc.next();
        int key = whichDay(A);
        // Please write your code here.
        int result = calculateDays(m2, d2) - calculateDays(m1, d1);

        int count = 0;
        while (result >= key) {
            count++;
            result -= 7;
        }
        System.out.print(count);
    }

    public static int calculateDays(int m, int d) {
        int[] month = new int[] {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int total = 0;
        for (int i = 1; i < m; i++) {
            total += month[i];
        }
        total += d;

        return total;
    }

    public static int whichDay(String A) {
        for (int i = 0; i < days.length; i++) {
            if (A.equals(days[i])) {
                return i;
            }
        }
        return -1;
    }
}