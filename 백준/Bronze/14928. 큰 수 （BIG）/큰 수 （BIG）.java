import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String n = scanner.next();
        scanner.close();
        
        int mod = 0;
        for (int i = 0; i < n.length(); i++) {
            mod = (mod * 10 + (n.charAt(i) - '0')) % 20000303;
        }
        
        System.out.println(mod);
    }
}