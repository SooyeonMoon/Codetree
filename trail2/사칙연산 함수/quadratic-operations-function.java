import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.

        String num = calculateNum(a, o , c);

        System.out.print(num);
    }

    public static String calculateNum(int a, char o, int c) {
        if (o == '+' || o == '-' || o == '/' || o == '*') {
            if (o == '+') {
                return a + " + " + c + " = " + String.valueOf(a + c);
            }
            else if (o == '-') {
                return a + " - " + c + " = " + String.valueOf(a - c);
            }
            else if (o == '/') {
                return a + " / " + c + " = " + String.valueOf(a / c);
            }
            else {
                return a + " * " + c + " = " + String.valueOf(a * c);
            }
        }
        return "False";
    }
}