import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] array = new int[3];

        for (int i = 0; i < 3; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        System.out.print(array[1]);
    }
}
