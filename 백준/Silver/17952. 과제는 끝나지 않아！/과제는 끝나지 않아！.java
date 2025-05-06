import java.util.Scanner;
import java.util.Stack;

public class Main {
    static class Task {
        int score;
        int time;

        Task(int score, int time) {
            this.score = score;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Task> stack = new Stack<>();
        int totalScore = 0;

        for (int i = 0; i < n; i++) {
            int cmd = sc.nextInt();

            if (cmd == 1) {
                int score = sc.nextInt();
                int time = sc.nextInt();
                stack.push(new Task(score, time));
            }

            if (!stack.isEmpty()) {
                Task current = stack.pop();
                current.time -= 1;
                if (current.time == 0) {
                    totalScore += current.score;
                } else {
                    stack.push(current);
                }
            }
        }

        System.out.println(totalScore);
    }
}
