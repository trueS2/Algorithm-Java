import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int result = 1;

        if (N > 0){
            for (int i = 1; i <= N; i++){
                result *= i;
            }
            System.out.println(result);
        } else{
            System.out.println(1);
        }
    }
}
