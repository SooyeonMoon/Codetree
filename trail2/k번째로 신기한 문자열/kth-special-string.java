import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next(); // 문자열 T
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        String[] w = new String[n];
        int p = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(t)) {
                w[p++] = words[i];
            }
        }
        Arrays.sort(w, 0, p);
        System.out.print(w[k - 1]);
    }
}