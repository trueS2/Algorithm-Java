import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        
        StringBuilder result = new StringBuilder();
        String[] words = input.split("-");
        
        for (String word : words) {
            result.append(word.charAt(0));
        }
        
        System.out.println(result.toString());
    }
}
