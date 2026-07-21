import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(height, weight, i + 1);
        }
        // Please write your code here.
        Arrays.sort(students, new Comparator<Student> () {
            @Override
            public int compare(Student a, Student b) {
                if (a.height == b.height) {
                    return b.weight - a.weight;
                }
                return a.height - b.height;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.print(students[i].height + " ");
            System.out.print(students[i].weight + " ");
            System.out.print(students[i].index + "\n");
        }
    }
}

class Student {
    int height, weight, index;

    public Student(int height, int weight, int index) {
        this.height = height;
        this.weight = weight;
        this.index = index;
    }
}