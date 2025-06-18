import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String action = input[1];

            if (action.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        List<String> result = new ArrayList<>(set);
        Collections.sort(result, Collections.reverseOrder());

        for (String name : result) {
            System.out.println(name);
        }
    }
}
