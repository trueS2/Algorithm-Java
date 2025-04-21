import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] A = new int[N];
        for (int i = 0; i < N; i ++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> deque = new LinkedList<>();

        for ( int i = 0; i < N; i++){
            while (!deque.isEmpty() && A[deque.getLast()] > A[i]) {
                deque.removeLast();
            }

            deque.addLast(i);

            if (deque.getFirst() <= i - L){
                deque.removeFirst();

            }

            bw.write(A[deque.getFirst()] + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
