import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] count = new long[M];
        long sum = 0;
        long answer = 0;

        count[0] = 1;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            sum = (sum + num) % M;
            count[(int)sum]++;
        }

        for (int i = 0; i < M; i++) {
            if (count[i] >= 2) {
                answer += count[i] * (count[i] - 1) / 2;
            }
        }

        System.out.println(answer);
    }
}
