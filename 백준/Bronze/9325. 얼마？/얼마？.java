import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int basePrice = sc.nextInt();
            int optionCount = sc.nextInt();
            int total = basePrice;

            for (int j = 0; j < optionCount; j++) {
                int quantity = sc.nextInt();
                int pricePerUnit = sc.nextInt();
                total += quantity * pricePerUnit;
            }

            System.out.println(total);
        }

        sc.close();
    }
}
