import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next(); // 이진수가 주어짐
        int key = Integer.parseInt(binary);
        int temp = key;

        int p = 1;
        while (temp >= 10) {
            p *= 10;
            temp /= 10;
        }
        // Please write your code here.
        int num = 0;

        for (int i = 0; i < binary.length(); i++) {
            num = num * 2 + key / p;
            key %= p;
            p /= 10;
        }
        System.out.print(num);
    }
}