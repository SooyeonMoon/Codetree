import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] * 3 + " ");
            }
            System.out.println();
        }
    }
}