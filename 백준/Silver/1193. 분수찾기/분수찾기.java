import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();

        int diagonal = 1;
        int sum = 0;

        while (sum < X) {
            sum += diagonal;
            diagonal++;
        }

        int position = X - (sum - (diagonal - 1));
        
        if ((diagonal - 1) % 2 == 0) {
            System.out.println(position + "/" + ((diagonal - 1) - position + 1));
        } else {
            System.out.println(((diagonal - 1) - position + 1) + "/" + position);
        }
    }
}
