import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int Math_A = sc.nextInt();
        int Eng_A = sc.nextInt();

        int Math_B = sc.nextInt();
        int Eng_B = sc.nextInt();

        if (Math_A > Math_B && Eng_A > Eng_B) {
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }
    }
}