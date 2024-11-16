import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner Sc = new Scanner(System.in);

        int A = Sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(A + " * " + i + " = " + (A * i));
        }
    }
}