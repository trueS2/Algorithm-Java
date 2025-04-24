import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int currentSum = 0;
        for (int i = 0; i < K; i++){
            currentSum += A[i];
        }

        int maxSum = currentSum;
        for (int i = K; i < N; i++){
            currentSum = currentSum - A[i-K] + A[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);

    }
}
