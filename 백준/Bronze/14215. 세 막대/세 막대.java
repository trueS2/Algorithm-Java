import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] sticks = new int[3];

        for(int i = 0; i < 3; i ++){
            sticks[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(sticks);

        int a = sticks[0], b = sticks[1], c = sticks[2];

        if (a + b > c){
            System.out.println(a + b + c);
        } else{
            System.out.println((a + b) * 2 - 1);
        }
    }
}
