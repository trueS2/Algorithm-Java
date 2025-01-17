import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for (String s : croatian) {
            input = input.replace(s, "*");
        }

        System.out.println(input.length());
    }
}
