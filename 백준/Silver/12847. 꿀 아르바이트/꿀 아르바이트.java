import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] T = new int[n];

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++){
            T[i] = Integer.parseInt(st.nextToken());
        }

        long currentPay = 0;
        for (int i = 0; i < m; i++){
            currentPay += T[i];
        }

        long maxPay = currentPay;
        for (int i = m; i < n; i++){
            currentPay = currentPay - T[i - m] + T[i];
            maxPay = Math.max(currentPay, maxPay);
        }

        System.out.println(maxPay);

    }
}
