import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] sequence = new int[n];
        
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int num = 1;
        boolean isPossible = true;

        for (int i = 0; i < n; i++) {
            int target = sequence[i];

            while (num <= target) {
                stack.push(num++);
                sb.append("+\n");
            }

            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.print(sb);
        } else {
            System.out.println("NO");
        }
    }
}

