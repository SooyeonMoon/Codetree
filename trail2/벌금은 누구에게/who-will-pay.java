import java.util.Scanner;

public class Main {
    public static int MAX_N = 100;

    public static int[] students = new int[MAX_N + 1];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 학생수
        int m = sc.nextInt();
        int k = sc.nextInt(); // 한 학생이 k번 이상 벌칙 ->

        int i;
        for (i = 0; i < m; i++) { // m번 벌칙 학생 호출해야 함
            int num = sc.nextInt();
            students[num]++;

            if (students[num] >= k) {
                System.out.print(num);
                break;
            }
        }
        
        if (i == m) {
            System.out.print("-1");
        }
    }
}