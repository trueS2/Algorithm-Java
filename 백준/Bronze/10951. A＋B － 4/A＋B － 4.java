import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner Sc = new Scanner(System.in);

        int Total = 0;
        while (Sc.hasNext()){
            int A = Sc.nextInt();
            int B = Sc.nextInt();
            Total = A + B;

            System.out.println(Total);
        }
    }
}