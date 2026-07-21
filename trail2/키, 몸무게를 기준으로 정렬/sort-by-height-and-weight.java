import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static Person[] person;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        person = new Person[n];

        for (int i = 0; i < person.length; i++) {
            person[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(person, new Comparator<Person> () {
            @Override
            public int compare(Person a, Person b) {
                if (a.h == b.h) {
                    return b.w - a.w;
                }
                return a.h - b.h;
            }
        });

        for (int i = 0; i < person.length; i++) {
            System.out.print(person[i].name + " ");
            System.out.print(person[i].h + " ");
            System.out.print(person[i].w + "\n");
        }
    }
}

class Person {
    String name;
    int h, w;

    public Person(String name, int h, int w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }
}