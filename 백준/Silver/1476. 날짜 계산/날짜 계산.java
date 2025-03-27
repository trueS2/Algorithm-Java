import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        int year = 1;
        
        while (true) {
            if ((year % 15 == E % 15) && (year % 28 == S % 28) && (year % 19 == M % 19)) {
                System.out.println(year);
                break;
            }
            year++;
        }
    }
}
