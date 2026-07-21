import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n개의 단어
        int k = sc.nextInt(); // k번째
        String t = sc.next(); // 문자열

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        String[] str = new String[n];
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (words[i].startsWith(t)) {
                str[p++] = words[i];
            }
        }
        Arrays.sort(str, 0, p);

        System.out.print(str[k - 1]);
    }
}