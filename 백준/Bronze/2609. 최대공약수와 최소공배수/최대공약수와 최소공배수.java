import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = getGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);

        sc.close();
    }

    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
