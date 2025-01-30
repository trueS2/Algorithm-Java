import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        if (N == 1) {
            System.out.println(1);
            return;
        }
        
        int layer = 1;
        int range = 2;

        while (range <= N) {
            range += 6 * layer;
            layer++;
        }
        
        System.out.println(layer);
    }
}
