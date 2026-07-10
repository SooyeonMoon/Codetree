import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.

        int num = judgeDate(y, m, d);

        if (num >= 3 && num <= 5) {
            System.out.print("Spring");
        }
        else if (num >= 6 && num <= 8) {
            System.out.print("Summer");
        }
        else if (num >= 9 && num <= 11) {
            System.out.print("Fall");
        }
        else if (num <= 2 && num > 0 || num == 12) {
            System.out.print("Winter");
        }
        else {
            System.out.print("-1");
        }
    }

    public static int judgeYear(int y) {
        // 윤년인지 판단, 2월 29일까지 있음
        if (y % 4 == 0 && y % 100 == 0 && y % 400 == 0) {
            //윤년
            return 1;
        }
        else if (y % 4 == 0 && y % 100 == 0) {
            //평년
            return 0;
        }
        else if (y % 4 == 0) {
            //윤년
            return 1;
        }
        else {
            //평년
            return 0;
        }
    }

    public static int judgeDate(int y, int m, int d) {
        if (m <= 12 && d <= judgeDay(y, m)) {
            return m;
        }
        return -1;
    }

    public static int judgeDay(int y, int m) {
        if (m == 2) {
            if (judgeYear(y) == 1)
                return 29;
            else {
                return 28;
            }
        }
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }
            return 31;
        }
    }