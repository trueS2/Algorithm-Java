import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for ( int i = 1; i <= N; i++){
            if ( 1 <= i && i <= 99){
                count ++;
            }else {
                int a = i/100;
                int b = (i / 10) % 10;
                int c = i % 10;
                if ( a - b == b - c){
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
