import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int m = 0; m < M; m++) {
            int i = scanner.nextInt() - 1;
            int j = scanner.nextInt() - 1;

            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }

        for (int ball : baskets) {
            System.out.print(ball + " ");
        }
    }
}
