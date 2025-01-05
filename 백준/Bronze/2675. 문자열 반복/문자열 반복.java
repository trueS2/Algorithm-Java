import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            int r = scanner.nextInt();
            String s = scanner.next();
            StringBuilder p = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                for (int k = 0; k < r; k++) {
                    p.append(c);
                }
            }

            System.out.println(p);
        }
    }
}
