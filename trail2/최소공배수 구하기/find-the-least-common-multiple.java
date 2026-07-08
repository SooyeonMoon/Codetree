import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        findLCM(n, m);
    }

    public static void findLCM(int n, int m) {
        
        int key;
        if (n > m) {
            key = n;
        }
        else {
            key = m;
        }

        for (int i = key; key % n != 0 || key % m != 0; key++);

        System.out.print(key);
    }
}