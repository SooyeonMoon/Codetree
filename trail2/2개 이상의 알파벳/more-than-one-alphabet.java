import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.

        if (checkAlphabet(A)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }

    public static boolean checkAlphabet(String s) {
        char ch = s.charAt(0);

        int total = 1;
        for (int i = 1; i < s.length(); i++) {
            if (ch != s.charAt(i)) {
                total++;
            }
            if (total >= 2) {
                return true;
            }
        }
        return false;
    }
}