import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner Sc = new Scanner(System.in);

        int T = Sc.nextInt();

        int Total = 0;
        for (int i = 1; i <= T; i++){
            int A = Sc.nextInt();
            int B = Sc.nextInt();
            Total = A + B;

            System.out.println("Case #" + i + ": " + Total);
        }
    }
}