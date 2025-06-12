import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> list = new LinkedList<>();
        String input = br.readLine();
        
        for (char ch : input.toCharArray()) {
            list.add(ch);
        }

        int m = Integer.parseInt(br.readLine());
        ListIterator<Character> cursor = list.listIterator(list.size());

        for (int i = 0; i < m; i++) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "L":
                    if (cursor.hasPrevious()) cursor.previous();
                    break;
                case "D":
                    if (cursor.hasNext()) cursor.next();
                    break;
                case "B":
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                    break;
                case "P":
                    cursor.add(command[1].charAt(0));
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        
        for (char ch : list) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
