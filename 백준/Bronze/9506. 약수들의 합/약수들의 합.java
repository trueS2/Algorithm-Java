import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            
            List<Integer> divisors = new ArrayList<>();
            int sum = 0;
            
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    divisors.add(i);
                    sum += i;
                }
            }
            
            if (sum == n) {
                System.out.print(n + " = " + divisors.get(0));
                for (int i = 1; i < divisors.size(); i++) {
                    System.out.print(" + " + divisors.get(i));
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
        sc.close();
    }
}
