import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        if (isHaveDate(M, D)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }

    public static boolean isHaveDate(int m, int d) {
        if (m < 0 || m >= 13) {
            return false;
        }
        else {
            if (m == 2) {
                if (d < 0 || d >= 29) {
                    return false;
                }
                else {
                    return true;
                }
            }
            else if (m == 8 || m == 10 || m == 12) {
                if (d < 0 || d >= 32) {
                    return false;
                }
                else {
                    return true;
                }
            }
            else if (m == 9 || m == 11) {
                if (d < 0 || d >= 31) {
                    return false;
                }
                else {
                    return true;
                }
            }
            else if (m % 2 == 0) {
                if (d < 0 || d >= 31) {
                    return false;
                }
                else {
                    return true;
                }
            }
            else  {
                if (d < 0 || d >= 32) {
                    return false;
                }
                else {
                    return true;
                }
            }
        }
    }
}