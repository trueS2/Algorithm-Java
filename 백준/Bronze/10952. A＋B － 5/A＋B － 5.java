import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner Sc = new Scanner(System.in);

        int Total = 0;
        while (true){
            int A = Sc.nextInt();
            int B = Sc.nextInt();
            Total = A + B;

            if (A == 0 && B == 0) {
                break;
            }

            System.out.println(Total);
        }
    }
}
