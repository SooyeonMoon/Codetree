import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        DifuseBomb db = new DifuseBomb(sc.next(), sc.next(), sc.nextInt());

        System.out.println("code : " + db.code);
        System.out.println("color : " + db.color);
        System.out.println("second : " + db.second);
    }
}

class DifuseBomb {
    String code;
    String color;
    int second;

    public DifuseBomb(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
}