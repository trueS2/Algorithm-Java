import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];

        int reversedA = reverseNumber(a);
        int reversedB = reverseNumber(b);

        System.out.println(Math.max(reversedA, reversedB));
    }

    public static int reverseNumber(String num) {
        StringBuilder reversed = new StringBuilder(num).reverse();
        return Integer.parseInt(reversed.toString());
    }
}

