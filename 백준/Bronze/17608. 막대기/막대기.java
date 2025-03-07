import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] sticks = new int[N];

        for ( int i = 0; i < N; i++){
            sticks[i] = sc.nextInt();
        }

        int count = 1;
        int maxHeight = sticks[N - 1];

        for ( int i = N - 2; i >= 0; i--){
            if (sticks[i] > maxHeight){
                count++;
                maxHeight = sticks[i];
            }
        }

        System.out.println(count);
        sc.close();
    }
}
