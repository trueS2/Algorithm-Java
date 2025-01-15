import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        boolean isPalindrome = true;
        int length = word.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println(isPalindrome ? 1 : 0);
    }
}
