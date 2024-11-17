import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAmount = scanner.nextInt();

        int numItems = scanner.nextInt();

        int calculatedTotal = 0;
        for (int i = 0; i < numItems; i++) {
            int price = scanner.nextInt();
            int quantity = scanner.nextInt();
            calculatedTotal += price * quantity;
        }

        if (calculatedTotal == totalAmount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}