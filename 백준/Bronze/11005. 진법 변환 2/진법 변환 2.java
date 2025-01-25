import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(convertToBase(n, b));
    }

    private static String convertToBase(int n, int b) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            int remainder = n % b;
            if (remainder < 10) {
                result.append((char) (remainder + '0'));
            } else {
                result.append((char) (remainder - 10 + 'A'));
            }
            n /= b;
        }
        return result.reverse().toString();
    }
}
