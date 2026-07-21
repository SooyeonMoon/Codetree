import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static Person[] p;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        p = new Person[n];
        for (int i = 0; i < p.length; i++) {
            p[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(p, (a, b) -> a.h - b.h);

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].name + " " + p[i].h + " " + p[i].w);
        }
    }
}

class Person {
    String name;
    int w, h;

    public Person(String name, int h, int w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }
}