import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine().trim());
        
        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            st.nextToken();
            
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                st.nextToken();
            }
            
            System.out.println("Material Management " + i);
            System.out.println("Classification ---- End!");
        }
    }
}
