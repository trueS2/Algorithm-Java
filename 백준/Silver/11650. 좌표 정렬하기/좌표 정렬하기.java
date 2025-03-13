import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int [][] points = new int [n][2];

        for ( int i = 0; i < n; i++){
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        for (int i = 0; i < n; i++) {
            System.out.println(points[i][0] + " " + points[i][1]);
        }

        sc.close();
    }
}
