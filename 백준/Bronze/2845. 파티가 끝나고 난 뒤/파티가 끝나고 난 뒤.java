import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int P = sc.nextInt();
        int tp = L * P;
        int[] array = new int[5];

        for (int i = 0; i < 5; i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i ++){
            System.out.print((array[i] - tp) + " ");
        }
    }
}
