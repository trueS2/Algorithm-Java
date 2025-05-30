import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        System.out.println(a * b / gcd(a, b));
    }

    static long gcd(long a, long b) {
        
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
