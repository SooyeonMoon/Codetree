import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static Position[] position;
    public static int[] nums;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        position = new Position[n];
        nums = new int[n];

        for (int i = 0; i < position.length; i++) {
            position[i] = new Position(sc.nextInt(), sc.nextInt());
            position[i].num = i + 1;
        }
        Arrays.sort(position);
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(position[i].num);
        }
    }
}

class Position implements Comparable<Position> {
    int x, y;
    int num;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(Position p) {
        if (Math.abs(this.x) + Math.abs(this.y) == Math.abs(p.x) + Math.abs(p.y)) {
            return this.num - p.num;
        }
        return (Math.abs(this.x) + Math.abs(this.y)) - (Math.abs(p.x) + Math.abs(p.y));
    }
}