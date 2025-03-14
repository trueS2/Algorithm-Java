import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for ( int i = 0; i < T; i++){
            String str = sc.nextLine();
            System.out.println(isvalid(str) ? "YES" : "NO");
        }

        sc.close();
    }

    public static boolean isvalid(String str){
        Stack<Character> stack = new Stack<>();

        for ( char ch : str.toCharArray()){
            if ( ch == '('){
                stack.push(ch);
            } else {
                if ( stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
