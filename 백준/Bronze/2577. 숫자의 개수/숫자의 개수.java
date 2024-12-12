import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int result = A * B * C;
        String resultStr = String.valueOf(result);

        int[] count = new int[10];

        for (char c : resultStr.toCharArray()) {
            count[c - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}
