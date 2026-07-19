import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        str1 = new String(ch1);


        String str2 = sc.next();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
        str2 = new String(ch2);

        System.out.print(ifSameWord(str1, str2));
    }

    public static String ifSameWord(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return "No";
        }

        int length = s1.length();
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return "No";
            }
        }
        return "Yes";
    }
}