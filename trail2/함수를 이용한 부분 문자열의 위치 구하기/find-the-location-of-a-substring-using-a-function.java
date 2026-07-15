import java.util.Scanner;

public class Main {

    public static String arr1;
    public static String arr2;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        arr1 = sc.next();
        arr2 = sc.next();

        int num = isPartSequence();

        System.out.print(num);
    }

    public static int isPartSequence() {
        int length = arr1.length() - arr2.length();
        for (int i = 0; i <= length; i++) {
            if (checkSequence(i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean checkSequence(int n) {
        for (int i = 0; i < arr2.length(); i++) {
            if (arr1.charAt(i + n) != arr2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}