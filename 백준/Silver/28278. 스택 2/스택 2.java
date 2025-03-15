import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> stack = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for ( int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            if (command == 1) {
                if (st.hasMoreTokens()) {
                    int X = Integer.parseInt(st.nextToken());
                    stack.push(X);
                }
            } else if (command == 2) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else if (command == 3) {
                sb.append(stack.size()).append("\n");
            } else if (command == 4) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (command == 5) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }

        System.out.print(sb);

    }
}
