import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String expr = sc.next();
        Stack<Integer> stack = new Stack<>();

        for (char c : expr.toCharArray()) {
            
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                
                if (c == '+') {
                    stack.push(a + b);
                } else if (c == '-') {
                    stack.push(a - b);
                } else if (c == '*') {
                    stack.push(a * b);
                } else if (c == '/') {
                    stack.push(a / b);
                }
            }
        }
        
        System.out.println(stack.pop());
    }
}
