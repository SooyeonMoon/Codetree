import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char key = sc.next().charAt(0);

        String[] fruits = {"apple", "banana", "grape", "blueberry", "orange"};

        int total = 0;
        for (int i = 0; i < 5; i++) {
            if (fruits[i].charAt(2) == key || fruits[i].charAt(3) == key) {
                System.out.println(fruits[i]);
                total++;
            }
        }
        System.out.println(total);
    }
}