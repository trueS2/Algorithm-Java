import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for ( int i = 0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;

            System.out.println("Case " + (i + 1) + ": " + sum );
        }
    }
}
