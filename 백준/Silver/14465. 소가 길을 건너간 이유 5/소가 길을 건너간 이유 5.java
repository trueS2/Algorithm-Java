import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] broken = new int[N + 1];

        for (int i = 0; i < B; i++) {
            int brokenIndex = Integer.parseInt(br.readLine());
            broken[brokenIndex] = 1;
        }

        int count = 0;
        for (int i = 1; i <= K; i++) {
            count += broken[i];
        }

        int min = count;
        for (int i = K + 1; i <= N; i++) {
            count = count - broken[i - K] + broken[i];
            min = Math.min(min, count);
        }

        System.out.println(min);
    }
}
