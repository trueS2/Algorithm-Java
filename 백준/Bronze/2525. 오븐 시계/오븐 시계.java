import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner Sc = new Scanner(System.in);

        int H = Sc.nextInt();
        int M = Sc.nextInt();
        int A = Sc.nextInt();

        M += A;

        while (M >= 60) {
            M -= 60;
            H += 1;

            if (H >= 24) {
                H = 0;
            }
        }

        System.out.println( H + " " + M );

    }
}