import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] baskets = new int[N];

        for (int t = 0; t < M; t++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for (int idx = i - 1; idx < j; idx++) {
                baskets[idx] = k;
            }
        }

        scanner.close();

        for (int ball : baskets) {
            System.out.print(ball + " ");
        }
    }
}
