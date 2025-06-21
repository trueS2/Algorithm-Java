import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++ ){
            queue.offer(i);
        }

        List<Integer> result = new ArrayList<>();

        while (queue.size() > 1){
            result.add(queue.poll());
            queue.offer(queue.poll());
        }

        result.add(queue.poll());

        for (int i = 0; i < result.size(); i++){
            System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
