import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int max = 0;
        int index = 0;
        
        for (int i = 1; i <= 9; i++) {
            int number = scanner.nextInt();
            if (number > max) {
                max = number;
                index = i;
            }
        }
        
        System.out.println(max);
        System.out.println(index);
        
        scanner.close();
    }
}
