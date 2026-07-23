import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();

        int num = 0;
        for (int i = 0; i < binary.length(); i++) { // 십진수로 변환
            num = num * 2 + (binary.charAt(i) - '0');
        }
        
        num *= 17; // 17배
        int[] arr = new int[20]; // 이진수 역으로 저장하는 배열
        int cnt = 0; // 배열의 인덱스

        while (true) {
            if (num < 2) {
                arr[cnt++] = num;
                break;
            }

            arr[cnt++] = num % 2;
            num /= 2;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}