import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int warboyPerformance = (B / A) * 3 * C;
        
        System.out.println(warboyPerformance);
        sc.close();
    }
}
