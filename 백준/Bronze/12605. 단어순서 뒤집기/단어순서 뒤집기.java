import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            String[] words = input.split(" ");

            StringBuilder sb = new StringBuilder();
            for (int j = words.length - 1; j >= 0; j--) {
                sb.append(words[j]);
                if (j > 0) sb.append(" "); 
            }

            System.out.println("Case #" + (i + 1) + ": " + sb.toString());
        }

        sc.close();
    }
}
