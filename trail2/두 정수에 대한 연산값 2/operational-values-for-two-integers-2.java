import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper w1 = new IntWrapper(a);
        IntWrapper w2 = new IntWrapper(b);

        modify(w1, w2);

        System.out.print(w1.value + " " + w2.value);
    }

    public static void modify(IntWrapper a, IntWrapper b) {
        if (a.value > b.value) {
            a.value *= 2;
            b.value += 10;
        }
        else {
            a.value += 10;
            b.value *= 2;
        }
    }
}

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}