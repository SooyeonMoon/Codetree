import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static Student[] students;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].name + " ");
            System.out.print(students[i].s1 + " ");
            System.out.print(students[i].s2 + " ");
            System.out.print(students[i].s3 + "\n");
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int s1, s2, s3;

    public Student(String name, int s1, int s2, int s3) {
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public int compareTo(Student s) {
        return (this.s1 + this.s2 + this.s3) - (s.s1 + s.s2 + s.s3);
    }
}