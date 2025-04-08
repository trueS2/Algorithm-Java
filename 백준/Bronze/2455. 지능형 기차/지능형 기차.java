import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        int current = 0;

        for (int i = 0; i < 4; i++) {
            int out = sc.nextInt();
            int inTrain = sc.nextInt();
            current = current - out + inTrain;
            
            if (current > max) {
                max = current;
            }
        }

        System.out.println(max);
    }
}