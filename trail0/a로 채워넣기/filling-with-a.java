import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String newStr1 = str.substring(0, 1);
        String newStr2 = str.substring(str.length() - 1, str.length());
        String newStr3 = str.substring(2, str.length() - 2);

        String s = newStr1 + "a" + newStr3 + "a" + newStr2;
        System.out.println(s);
    }
}