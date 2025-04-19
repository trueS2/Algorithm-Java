import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int result = 0;
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for ( int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        for ( int k = 0; k < N; k++){
            long find = A[k];
            int i = 0;
            int j = N - 1;

            while ( i < j ){
                if ( A[i] + A[j] == find){
                    if ( i != k && j != k){
                        result++;
                        break;
                    } else if ( i == k) {
                        i++;
                    } else {
                        j--;
                    }

                } else if ( A[i] + A[j] > find) {
                    j--;
                } else {
                    i++;
                }
            }
        } 
        
        System.out.println(result);
    }
}
