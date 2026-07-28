import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static int MAX_N = 100;
    public static int MAX_T = 250;

    public static int[] developers = new int[MAX_N + 1]; // 감염 여부 기록
    public static Patient[] person = new Patient[MAX_T + 1]; // 개발자 관리
    public static int[] count = new int[MAX_N + 1]; // 몇 번 감염시켰는지

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n명의 개발자
        int k = sc.nextInt(); // 최대 k번 악수를 통해서만 전염병 전파 가능
        int p = sc.nextInt(); // 초기 감염된 개발자 번호
        int t = sc.nextInt(); // t번에 걸쳐 악수

        developers[p] = 1; // p번 개발자는 초기 감염자이다.

        for (int i = 0; i < t; i++) {
            person[i] = new Patient(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(person, 0, t);

        for (int i = 0; i < t; i++) {
            if (developers[person[i].x] == 1) { // 감염자라면 ~
                if (developers[person[i].y] != 1 && count[person[i].x] < k) {
                    developers[person[i].y] = 1; // 감염자 확정
                }
                else {
                    count[person[i].y]++;
                }
                count[person[i].x]++;
            }
            else if (developers[person[i].y] == 1) { // 감염자라면 ~
                if (developers[person[i].x] != 1 && count[person[i].y] < k) {
                    developers[person[i].x] = 1; // 감염자 확정
                }
                else {
                    count[person[i].x]++;
                }
                count[person[i].y]++;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(developers[i]);
        }
    }
}

class Patient implements Comparable<Patient> {
    int time, x, y;

    public Patient(int time, int x, int y) {
        this.time = time;
        this.x = x;
        this.y = y;
    }
 
    public int compareTo(Patient p) {  //오름차순 정렬
        if (this.time == p.time) {
            if (this.x == p.x) {
                return this.y - p.y;
            }
            return this.x - p.x;
        }
        return this.time - p.time;
    }
}