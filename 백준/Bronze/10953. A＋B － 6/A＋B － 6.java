import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String input = sc.nextLine();
            String[] numbers = input.split(",");

            int A = Integer.parseInt(numbers[0].trim());
            int B = Integer.parseInt(numbers[1].trim());

            System.out.println(A + B);
        }
    }
}