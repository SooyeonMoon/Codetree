import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static Person[] person = new Person[5];

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            person[i] = new Person(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        System.out.println("name");
        Arrays.sort(person, (a, b) -> a.name.compareTo(b.name));
        for (int i = 0; i < 5; i++) {
            System.out.print(person[i].name + " ");
            System.out.print(person[i].h + " ");
            System.out.print(person[i].w + "\n");
        }

        System.out.println("\nheight");
        Arrays.sort(person, (a, b) -> b.h - a.h);
        for (int i = 0; i < 5; i++) {
            System.out.print(person[i].name + " ");
            System.out.print(person[i].h + " ");
            System.out.print(person[i].w + "\n");
        }
    }
}

class Person {
    String name;
    int h;
    double w;

    public Person(String name, int h, double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }
}