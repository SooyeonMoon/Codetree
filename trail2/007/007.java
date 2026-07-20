import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        Secret s = new Secret(sc.next(), sc.next(), sc.nextInt());

        System.out.println("secret code : " + s.code);
        System.out.println("meeting point : " + s.place);
        System.out.println("time : " + s.time);
    }
}

class Secret {
    String code;
    String place;
    int time;

    public Secret(String code, String place, int time) {
        this.code = code;
        this.place = place;
        this.time = time;
    }
}