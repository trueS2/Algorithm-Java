import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++){
            int N = sc.nextInt();
            int d = N % 100;

            if (d != 0 && (N + 1) % d == 0 ){
                System.out.println("Good");
            } else {
                System.out.println("Bye");
            }
        }
    }
}
