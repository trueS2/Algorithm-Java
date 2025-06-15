import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] passengers = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 1; i <= n; i++) {
            passengers[i] = Integer.parseInt(st.nextToken());
        }

        int k = Integer.parseInt(br.readLine());
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + passengers[i];
        }

        int[][] dp = new int[4][n + 1];

        for (int t = 1; t <= 3; t++) {
            for (int i = t * k; i <= n; i++) {
                dp[t][i] = Math.max(dp[t][i - 1], dp[t - 1][i - k] + sum[i] - sum[i - k]);
            }
        }

        System.out.println(dp[3][n]);
    }
}
