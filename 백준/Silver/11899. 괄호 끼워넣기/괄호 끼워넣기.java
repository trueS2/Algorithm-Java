import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int open = 0;
        int need = 0;

        for (char ch : input.toCharArray()){
            if (ch == '('){
                open++;
            } else if (ch == ')') {
                if (open > 0){
                    open --;
                } else {
                    need++;
                }

            }
        }
        System.out.println(open + need);
    }
}
