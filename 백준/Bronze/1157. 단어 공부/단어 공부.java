import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        int[] alphabetCount = new int[26];

        for (int i = 0; i < input.length(); i++) {
            alphabetCount[input.charAt(i) - 'A']++;
        }

        int maxCount = 0;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                result = (char) (i + 'A');
            } else if (alphabetCount[i] == maxCount) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
