import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int N = sc.nextInt();
        sc.nextLine();

        for ( int i = 0; i < N; i++){
            String command = sc.next();
            
            if ( command.equals("push")){
                int X = sc.nextInt();
                stack.push(X);
            } else if (command.equals("pop")) {
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            } else if (command.equals("size")) {
                System.out.println(stack.size());
            } else if (command.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            } else if (command.equals("top")){
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }
        }
        sc.close();
    }
}
