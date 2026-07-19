import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        String str2 = new String(chars);
        System.out.print(str2);
    }
}