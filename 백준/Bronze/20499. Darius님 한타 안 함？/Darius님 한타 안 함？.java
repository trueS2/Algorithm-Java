import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] input = sc.next().split("/");
        
        int k = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        
        if (k + a < d || d == 0) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }
        
        sc.close();
    }
}
