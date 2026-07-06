import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int key = A;
        while (key <= B) {
            System.out.print(key + " ");
            
            if (key % 2 == 0) {
                key += 3;
            }
            else {
                key *= 2;
            }
        }
    }
}