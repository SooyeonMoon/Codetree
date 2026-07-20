import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] people = new Person[n];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(sc.next(), sc.next(), sc.next());
        }

        int key = 0;
        for (int i = 1; i < people.length; i++) {
            if (people[key].name.compareTo(people[i].name) < 0) {
                key = i;
            }
        }

        System.out.println("name " + people[key].name);
        System.out.println("addr " + people[key].address);
        System.out.println("city " + people[key].place);
    }
}

class Person {
    String name;
    String address;
    String place;

    public Person(String name, String address, String place) {
        this.name = name;
        this.address = address;
        this.place = place;
    }
}