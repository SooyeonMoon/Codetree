import java.util.Scanner;

public class Main {
    public static int MAX_N = 100;

    public static int[] arr = new int[2 * MAX_N + 1];
    public static int[] distance = new int[MAX_N + 1];
    public static String[] direction = new String[MAX_N + 1];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            distance[i] = sc.nextInt();
            direction[i] = sc.next();
        }
        countDistance(n);
        int count = countMoreThanTwo();

        System.out.print(count);
    }

    public static void countDistance(int n) {
        int start = 100;

        for (int i = 0; i < n; i++) {
            int count = 0;
            if (direction[i].equals("L")) { // 왼쪽으로 이동
                for (int a = start; count < distance[i]; count++) {
                    arr[--a]++;
                }
                start -= distance[i];
            }
            else {                          // 오른쪽으로 이동
                for (int a = start; count < distance[i]; count++) {
                    arr[a++]++;
                }
                start += distance[i];
            }
        }
    }

    public static int countMoreThanTwo() {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2) {
                count++;
            }
        }
        return count;
    }
}