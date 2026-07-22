import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // a시 b분
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt(); // c시 d분

        int timeA = 0;
        int timeB = 0;
        int hour = 0, min = 0;

        while (true) {
            if (hour == a && min == b) {
                break;
            }
            timeA++;
            min++;
            
            if (min == 60) {
                hour++;
                min = 0;
            }
        }

        hour = 0;
        min = 0;
        while (true) {
            if (hour == c && min == d) {
                break;
            }
            timeB++;
            min++;
            
            if (min == 60) {
                hour++;
                min = 0;
            }
        }

        System.out.print(timeB - timeA);
    }
}