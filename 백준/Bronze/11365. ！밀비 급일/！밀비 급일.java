import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()){
            String line = sc.nextLine();
            if (line.equals("END"))
                break;

            System.out.println(new StringBuilder(line).reverse().toString());
        }
    }
}
