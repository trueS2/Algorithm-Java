import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if (A == 0 && B == 0 && C == 0) {
                break;
            }

            int max = Math.max(A, Math.max(B, C));
            int sum = A + B + C - max;

            if (max >= sum) {
                System.out.println("Invalid");
            }
            else if (A == B && B == C) {
                System.out.println("Equilateral");
            }
            else if (A == B || A == C || B == C) {
                System.out.println("Isosceles");
            }
            else {
                System.out.println("Scalene");
            }
        }

        sc.close();
    }
}
