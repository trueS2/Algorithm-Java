import java.util.Scanner;

public class Main {
    static int[][] dp = new int[31][31];

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(combination(M, N));
        }
    }

    static int combination(int n, int r) {
        
        if (dp[n][r] > 0) return dp[n][r];
        if (n == r || r == 0) return dp[n][r] = 1;
        return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }
}
