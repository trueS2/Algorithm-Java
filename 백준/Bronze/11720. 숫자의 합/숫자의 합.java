import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        String numbers = sc.next();
        
        char[] numArray = numbers.toCharArray();
        
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            sum += numArray[i] - '0';
        }
        
        System.out.println(sum);

    }
}