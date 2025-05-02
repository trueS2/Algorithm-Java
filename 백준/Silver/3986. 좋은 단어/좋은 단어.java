import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = sc.next();
            char[] chars = word.toCharArray();
            Stack<Character> stack = new Stack<>();

            for (char c : chars){
                if (!stack.isEmpty() && stack.peek() == c){
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            if (stack.isEmpty()){
                count ++;
            }
        }

        System.out.println(count);
    }
}
