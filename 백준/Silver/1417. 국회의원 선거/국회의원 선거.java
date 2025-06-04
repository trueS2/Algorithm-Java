import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }

        int dasom = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 1; i < n; i++) {
            pq.add(sc.nextInt());
        }

        int count = 0;
        while (!pq.isEmpty() && pq.peek() >= dasom) {
            int top = pq.poll();
            pq.add(top - 1);
            dasom++;
            count++;
        }

        System.out.println(count);
    }
}
