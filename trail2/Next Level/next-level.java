import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        User u1 = new User();
        User u2 = new User(sc.next(), sc.nextInt());

        System.out.println("user " + u1.id + " lv " + u1.level);
        System.out.println("user " + u2.id + " lv " + u2.level);
    }
}

class User {
    String id;
    int level;

    public User() {
        id = "codetree";
        level = 10;
    }

    public User(String id, int level) {
        this.id = id;
        this.level = level;
    }
}