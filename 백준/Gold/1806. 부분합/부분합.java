import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int startPoint = 0;
        int endPoint = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        while (true) {
            if (sum >= S) {
                minLength = Math.min(minLength, endPoint - startPoint);
                sum -= A[startPoint];
                startPoint++;
            } else if (endPoint == N) {
                break;
            } else {
                sum += A[endPoint];
                endPoint++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }
    }
}

