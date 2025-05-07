import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        Stack<Character> stack = new Stack<>();

        int result = 0;

        for (int i = 0; i < input.length(); i++){
            char current = input.charAt(i);

            if (current == '('){
                stack.push(current);
            } else {
                stack.pop();


                if (input.charAt(i-1) == '('){
                    result += stack.size();
                } else {
                    result += 1;
    
                }
            }
        }
        
        System.out.println(result);
    }
}
