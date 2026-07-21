import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static Student[] students;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];

        students = new Student[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            korean[i] = sc.nextInt();
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();
        }
        // Please write your code here.

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], korean[i], english[i], math[i]);
        }
        Arrays.sort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].name + " ");
            System.out.print(students[i].kor + " ");
            System.out.print(students[i].eng + " ");
            System.out.print(students[i].math + "\n");
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int kor, eng, math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int compareTo(Student s) {
        if (this.kor == s.kor) {
            if (this.eng == s.eng) {
                return s.math - this.math;
            }
            else {
                return s.eng - this.eng;
            }
        }
        return s.kor - this.kor;
    }
}