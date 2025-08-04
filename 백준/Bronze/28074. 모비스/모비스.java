import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();

        Set<Character> required = Set.of('M', 'O', 'B', 'I', 'S');
        Set<Character> present = new HashSet<>();
        
        for (char ch : A.toCharArray()){
            if (required.contains(ch)){
                present.add(ch);
            }
        }
        
        if (present.containsAll(required)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}