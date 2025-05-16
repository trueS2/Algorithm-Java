import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Stack<Character> stack = new Stack<>();

        boolean insideTag = false;

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);

            if (c == '<'){
                while (!stack.isEmpty()){
                    output.append(stack.pop());
                }
                insideTag = true;
                output.append(c);
            } else if (c == '>') {
                insideTag = false;
                output.append(c);
            } else if (insideTag) {
                output.append(c);
            } else {
                if (c == ' '){
                    while (!stack.isEmpty()){
                        output.append(stack.pop());
                    }
                    output.append(' ');
                } else {
                    stack.push(c);
                }
            }
        }
        while (!stack.isEmpty()){
            output.append(stack.pop());
        }

        System.out.println(output);
    }
}
