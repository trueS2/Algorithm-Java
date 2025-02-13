import java.util.Scanner;

public class Main {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, sum;

        for (int i = 2; i <= n; i++ ){
            sum = a + b;
            a = b;
            b= sum;
        }
        return b;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println(fibonacci(n));
        
        sc.close();
    }
}
