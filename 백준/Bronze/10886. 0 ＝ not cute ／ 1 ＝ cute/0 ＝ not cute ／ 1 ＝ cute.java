import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int vote = sc.nextInt();
            if (vote == 1) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }

        sc.close();
    }
}

