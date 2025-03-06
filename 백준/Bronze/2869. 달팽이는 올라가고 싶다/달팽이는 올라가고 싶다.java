import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();
        scanner.close();

        int day = (V - B - 1) / (A - B) + 1;
        System.out.println(day);
    }
}
