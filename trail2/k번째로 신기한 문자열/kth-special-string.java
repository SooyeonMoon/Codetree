import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static String[] s;
    public static String str;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt(); // k번째 문자열 출력
        str = sc.next(); // 문자열 T

        s = new String[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }
        Arrays.sort(s);

        String[] s2 = isSequence();
        System.out.print(s2[k - 1]);
    }

    public static String[] isSequence() {
        String[] str = new String[s.length];
        int p = 0;
        for (int i = 0; i < s.length; i++) {
            if (isPart(i)) {
                str[p++] = s[i];
            }
        }
        return str;
    }

    public static boolean isPart(int n) {
        String S = s[n];
        for (int i = 0; i < str.length(); i++) {
            if (S.charAt(i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}