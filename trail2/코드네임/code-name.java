import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        Player[] players = new Player[5];
        for (int i = 0; i < 5; i++) {
            players[i] = new Player(sc.next(), sc.nextInt());
        }

        Player s = lowScorePlayer(players);
        System.out.print(s.name + " " + s.score);
    }

    public static Player lowScorePlayer(Player[] s) {
        int score = s[0].score;
        int key = 0;

        for (int i = 1; i < s.length; i++) {
            if (score > s[i].score) {
                score = s[i].score;
                key = i;
            }
        }
        return s[key];
    }
}

class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}