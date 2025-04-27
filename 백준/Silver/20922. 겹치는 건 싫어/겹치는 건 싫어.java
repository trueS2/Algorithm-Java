import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
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

        int[] count = new int[100001];
        int startPoint = 0;
        int endPoint = 0;
        int maxLength = 0;

        while (endPoint < N) {
            if (count[A[endPoint]] < K) {
                count[A[endPoint]]++;
                endPoint++;
            } else {
                count[A[startPoint]]--;
                startPoint++;
            }
            maxLength = Math.max(maxLength, endPoint - startPoint);
        }

        System.out.println(maxLength);
    }
}
