import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        sc.close();


        int length = input.length();

        for (int i = 0; i < length; i += 10){
            System.out.println(input.substring(i, Math.min(i + 10, length)));
        }

    }
}
