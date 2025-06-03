import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        int num = 1;
        while (!queue.isEmpty()) {
            if (queue.peek() == num) {
                queue.poll();
                num++;
            } else if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                num++;
            } else {
                stack.push(queue.poll());
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == num) {
                stack.pop();
                num++;
            } else {
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");
    }
}
