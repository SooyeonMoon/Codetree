import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int gen = sc.nextInt();
        int age = sc.nextInt();

        if (gen == 1) {
            if (age >= 19) {
                System.out.println("WOMAN");
            }
            else {
                System.out.println("GIRL");
            }
        }

        if (gen == 0) {
            if (age >= 19) {
                System.out.println("MAN");
            }
            else {
                System.out.println("BOY");
            }
        }
    }
}