import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = input.split("\\s+");
            System.out.println(words.length);
        }
    }
}
