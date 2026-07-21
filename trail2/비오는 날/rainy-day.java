import java.util.Scanner;
public class Main {

    public static Forecast f = new Forecast("9999-99-99", "", "");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Forecast[] arr = new Forecast[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            arr[i] = new Forecast(date, day, weather);

            if (arr[i].weather.equals("Rain")) {
                if (f.date.compareTo(arr[i].date) > 0) {
                    f = arr[i];
                }
            }
        }
        System.out.print(f.date + " " + f.day + " " + f.weather);
    }
}

class Forecast {
    String date, day, weather;

    public Forecast(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}