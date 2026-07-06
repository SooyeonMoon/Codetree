import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.length() > str2.length()) {
            System.out.print(str1 + " " + str1.length());
        }
        else if (str1.length() < str2.length()) {
            System.out.print(str2 + " " + str2.length());
        }
        else {
            System.out.print("same");
        }
    }
}