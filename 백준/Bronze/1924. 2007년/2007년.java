import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        String[] weekDays = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

        int totalDays = 0;

        for (int i = 0; i < X - 1; i++) {
            totalDays += daysInMonth[i];
        }

        totalDays += Y;

        System.out.println(weekDays[totalDays % 7]);

        sc.close();
    }
}


