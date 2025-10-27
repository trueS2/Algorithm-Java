import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++){
            list.add(sc.nextLine());
        }

        list.sort((a,b) -> {
            int ageA = Integer.parseInt(a.split(" ")[0]);
            int ageB = Integer.parseInt(b.split(" ")[0]);
            return ageA - ageB;
        });

        for (String s : list){
            System.out.println(s);
        }

    }
}
