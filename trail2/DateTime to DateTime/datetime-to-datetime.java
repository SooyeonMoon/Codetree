import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // a일
        int b = sc.nextInt(); // b시
        int c = sc.nextInt(); // c분

        int totalTime = getTime(a, b, c);
        System.out.print(totalTime);
    }

    public static int getTime(int a, int b, int c) {
        int total = 60 * 24 * 11 + 60 * 11 + 11;
        int totalTime = 60 * 24 * a + 60 * b + c;

        if (total > totalTime) {
            return -1;
        }
        return totalTime - total;
    }
}