import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String name = sc.next();
                String type = sc.next();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int result = 1;
            for (int count : map.values()) {
                result *= (count + 1);
            }

            System.out.println(result - 1);
        }
    }
}
