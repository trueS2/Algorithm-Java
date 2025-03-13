import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }

    private static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];
        char prev = 0;

        for (char c : word.toCharArray()){
            if (prev != c){
                if (seen[c-'a']){
                    return false;
                }
                seen[c-'a'] = true;
            }
            prev = c;
        }
        return true;

    }

}
