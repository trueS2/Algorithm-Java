import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner Sc = new Scanner(System.in);

        int H = Sc.nextInt();
        int M = Sc.nextInt();

        M -= 45;

        if ( M < 0 ){
            M += 60;
            H -= 1;
            if ( H < 0 ){
                H = 23;
            }
        }
        System.out.println(H + " " + M);
    }
}
