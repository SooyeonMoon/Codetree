import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Weather[] w = new Weather[n];

        for (int i = 0; i < w.length; i++) {
            w[i] = new Weather(sc.next(), sc.next(), sc.next());
        }

        int[] arr = new int[n];
        int p = 0;
        for (int i = 0; i < w.length; i++) {
            if (w[i].weather.equals("Rain")) {
                arr[p++] = i;
            }
        }

        int index = 0;
        for (int i = 1; i < p; i++) {
            if (w[arr[i]].date.compareTo(w[arr[index]].date) < 0) {
                index = i;
            }
        }

        System.out.println(w[arr[index]].date + " " + w[arr[index]].day + " " + w[arr[index]].weather);
    }
}

class Weather {
    String date;
    String day;
    String weather;

    public Weather(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}