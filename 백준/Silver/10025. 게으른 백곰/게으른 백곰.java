import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[1000001];
        int maxIndex = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int g = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            arr[x] += g;
            if (x > maxIndex) maxIndex = x;
        }

        int windowSize = 2 * K + 1;
        int sum = 0;
        int max = 0;

        for (int i = 0; i < windowSize && i <= 1000000; i++) {
            sum += arr[i];
        }
        
        max = sum;

        for (int i = windowSize; i <= 1000000; i++) {
            sum += arr[i] - arr[i - windowSize];
            if (sum > max) max = sum;
        }

        System.out.println(max);
    }
}
