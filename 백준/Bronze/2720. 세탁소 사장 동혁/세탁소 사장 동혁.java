import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] coins = {25, 10, 5, 1};

        for (int i = 0; i < t; i++) {
            int change = scanner.nextInt();
            for (int coin : coins) {
                System.out.print(change / coin + " ");
                change %= coin;
            }
            System.out.println();
        }
    }
}
