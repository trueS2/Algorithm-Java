import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        int k1 = Integer.parseInt(input[0]);
        String o1 = input[1];
        int k2 = Integer.parseInt(input[2]);
        String o2 = input[3];
        int k3 = Integer.parseInt(input[4]);

        ArrayList<Integer> results = new ArrayList<>();
        
        int res1 = calculate(calculate(k1, o1, k2), o2, k3);
        results.add(res1);

        int res2 = calculate(k1, o1, calculate(k2, o2, k3));
        results.add(res2);

        Collections.sort(results);
        System.out.println(results.get(0));
        System.out.println(results.get(1));
        
        scanner.close();
    }

    public static int calculate(int a, String operator, int b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (a < 0 && b > 0 || a > 0 && b < 0) {
                    return -(Math.abs(a) / Math.abs(b));
                }
                return Math.abs(a) / Math.abs(b);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
