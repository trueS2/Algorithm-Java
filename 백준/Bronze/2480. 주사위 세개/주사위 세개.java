import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner Sc = new Scanner(System.in);

        int A = Sc.nextInt();
        int B = Sc.nextInt();
        int C = Sc.nextInt();

        if (A == B && B == C) {
            System.out.println(10000 + A * 1000);
        } else if (A == B || B == C || A == C) {
            int same = (A == B) ? A : (B == C) ? B : C;
            System.out.println(1000 + same * 100);
        } else {
            int max = Math.max(A, Math.max(B, C));
            System.out.println(max * 100);
        }
    }
}