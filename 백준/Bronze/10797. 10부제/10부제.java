import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] array = new int[5];

        int count = 0;

        for (int i = 0; i < 5; i++){
            array[i] = sc.nextInt();
            if (array[i] == N){
                count++;
            }
        }

        System.out.println(count);
    }
}
