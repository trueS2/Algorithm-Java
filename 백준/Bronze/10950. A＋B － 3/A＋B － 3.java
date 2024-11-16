import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner Sc = new Scanner(System.in);

        int x = Sc.nextInt();

        for(int i = 0; i < x; i++){
            int A = Sc.nextInt();
            int B = Sc.nextInt();
            System.out.println(A + B);
        }
    }
}