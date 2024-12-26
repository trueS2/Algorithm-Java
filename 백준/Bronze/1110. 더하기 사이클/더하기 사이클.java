import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int original = N;
        int count = 0;

        do {
            int tens = N / 10;
            int units = N % 10;
            int sum = tens + units;
            N = (units * 10) + (sum % 10);
            count++;
        } while (N != original);

        System.out.println(count);
    }
}
