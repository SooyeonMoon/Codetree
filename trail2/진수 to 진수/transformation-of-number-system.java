import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // n을 a진수에서 십진수로 바꿔야 함
        int b = sc.nextInt(); // n을 b진수로 표현해야 함
        String n = sc.next(); // a진수로 표현된 수 n

        // 1. n을 a진수에서 십진수로 변환
        int num = 0;
        for (int i = 0; i < n.length(); i++) {
            num = num * a + (n.charAt(i) - '0');
        }

        // 2. 십진수로 표현된 n을 다시 b진수로 변환
        int[] binary = new int[20];
        int cnt = 0;
        while (true) {
            if (num < b) {
                binary[cnt++] = num;
                break;
            }

            binary[cnt++] = num % b;
            num /= b;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}