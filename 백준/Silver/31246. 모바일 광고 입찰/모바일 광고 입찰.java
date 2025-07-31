import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] diffs = new int[N];

        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            diffs[i] = B - A;
        }

        Arrays.sort(diffs);

        int minX = Math.max(0, diffs[K - 1]);

        System.out.println(minX);

    }
}
