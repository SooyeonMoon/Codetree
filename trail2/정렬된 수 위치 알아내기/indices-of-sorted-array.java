import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //길이
        int[] answer = new int[n]; // 인덱스 저장
        Number[] nums = new Number[n]; // 배열
        int key; // 입력

        for(int i = 0; i < n; i++){
            key = sc.nextInt();
            nums[i] = new Number(key, i);
        }
        // Please write your code here.
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) { // answer에 인덱스 저장
            answer[nums[i].index] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}

class Number implements Comparable<Number> {
    int num, index;

    public Number(int num, int index) {
        this.num = num;
        this.index = index;
    }

    public int compareTo(Number n) {
        if (this.num != n.num) {
            return this.num - n.num;
        }
        return this.index - n.index;
    }
}