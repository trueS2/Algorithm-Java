import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int points = (int) Math.pow(2, n) + 1;
        
        System.out.println(points * points);
    }
}
