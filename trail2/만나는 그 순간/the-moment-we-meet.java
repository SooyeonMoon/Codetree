import java.util.Scanner;

public class Main {
    public static int MAX_NUM = 1000000;

    public static int[] location_A = new int[MAX_NUM + 1];
    public static int[] location_B = new int[MAX_NUM + 1];

    public static int n, m;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int cur = 0;
        int t = 1;
        for (int i = 0; i < n; i++) {
            char da = sc.next().charAt(0);
            int xa = sc.nextInt();

            if (da == 'R') {
                for (int a = t; a < t + xa; a++) {
                    location_A[a] = ++cur;
                    // System.out.print(location_A[a] + " ");
                }
            }
            else {
                for (int a = t; a < t + xa; a++) {
                    location_A[a] = --cur;
                    // System.out.print(location_A[a] + " ");
                }
            }
            // System.out.println();
            t += xa;
        }
        for (int i = t; i < location_A.length; i++) {
            location_A[i] = location_A[t - 1];
        }

        cur = 0;
        t = 1;
        for (int i = 0; i < m; i++) {
            char db = sc.next().charAt(0);
            int xb = sc.nextInt();

            if (db == 'R') {
                for (int a = t; a < t + xb; a++) {
                    location_B[a] = ++cur;
                    // System.out.print(location_B[a] + " ");
                }
            }
            else {
                for (int a = t; a < t + xb; a++) {
                    location_B[a] = --cur;
                    // System.out.print(location_B[a] + " ");
                }
            }
            // System.out.println();
            t += xb;
        }
        for (int i = t; i < location_B.length; i++) {
            location_B[i] = location_B[t - 1];
        }

        int loc = ifSameLocation();
        System.out.print(loc);
    }

    public static int ifSameLocation() {
        int length = MAX_NUM + 1;
        
       for (int i = 1; i < length; i++) {
            if (location_A[i] == location_B[i]) {
                return i;
            }
        }
        return -1;
    }
}
