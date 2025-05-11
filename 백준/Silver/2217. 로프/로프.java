import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ropes = new int[n];
        
        for (int i = 0; i < n; i++) {
            ropes[i] = sc.nextInt();
        }

        Arrays.sort(ropes);

        int maxWeight = 0;
        for (int i = 0; i < n; i++) {
            int weight = ropes[i] * (n - i);
            if (weight > maxWeight) {
                maxWeight = weight;
            }
        }

        System.out.println(maxWeight);
    }
}
