import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String N = sc.next();
        char[] digits = N.toCharArray();
        int sum = 0;
        boolean hasZero = false;

        for (char c : digits) {
            int num = c - '0';
            sum += num;
            if (num == 0) {
                hasZero = true;
            }
        }

        if (!hasZero || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        Arrays.sort(digits);
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}
