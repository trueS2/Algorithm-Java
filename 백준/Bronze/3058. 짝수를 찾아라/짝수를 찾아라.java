import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int sum = 0;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < 7; i++) {
                int num = sc.nextInt();

                if (num % 2 == 0) {
                    sum += num;
                    if (num < min) {
                        min = num;
                    }
                }
            }

            System.out.println(sum + " " + min);
        }

        sc.close();
    }
}

