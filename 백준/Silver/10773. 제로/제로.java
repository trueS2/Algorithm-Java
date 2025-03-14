import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int K = sc.nextInt();

        for ( int i = 0; i < K; i++){
            int num = sc.nextInt();
            if ( num == 0){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(num);
            }
        }


        int sum = 0;
        for ( int n : stack){
            sum += n;
        }

        System.out.println(sum);
        sc.close();
    }

}
