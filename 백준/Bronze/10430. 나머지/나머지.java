import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        int A = Sc.nextInt();
        int B = Sc.nextInt();
        int C = Sc.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}
