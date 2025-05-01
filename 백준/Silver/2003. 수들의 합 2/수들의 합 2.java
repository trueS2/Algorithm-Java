import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0, end = 0, sum = 0, count = 0;

        while (true) {
            if (sum >= m) {
                sum -= arr[start++];
            } else if (end == n) {
                break;
            } else {
                sum += arr[end++];
            }

            if (sum == m) {
                count++;
            }
        }

        System.out.println(count);
    }
}
