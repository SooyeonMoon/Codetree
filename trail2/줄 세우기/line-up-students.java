import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static Student[] students;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        students = new Student[n];

        int[] height = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            students[i] = new Student(height[i], weight[i], i + 1);
        }
        // Please write your code here.
        Arrays.sort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].height + " ");
            System.out.print(students[i].weight + " ");
            System.out.print(students[i].num + "\n");
        }
    }
}

class Student implements Comparable<Student> {
    int height, weight, num;  

    public Student(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    public int compareTo(Student s) {
        if (this.height == s.height) {
            if (this.weight == s.weight) {
                return this.num - s.num;
            }
            else {
                return s.weight - this.weight;
            }
        }
        return s.height - this.height;
    }
}