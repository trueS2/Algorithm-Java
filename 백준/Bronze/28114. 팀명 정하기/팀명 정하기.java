import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] people = new int[3][2];
        String[] names = new String[3];

        for (int i = 0; i < 3; i++) {
            people[i][0] = scanner.nextInt();
            people[i][1] = scanner.nextInt();
            names[i] = scanner.next();
        }

        Integer[] years = new Integer[3];
        for (int i = 0; i < 3; i++) {
            years[i] = people[i][1] % 100;
        }
        Arrays.sort(years);

        StringBuilder team1 = new StringBuilder();
        for (int y : years) {
            team1.append(y);
        }

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new int[]{people[i][0], i});
        }
        list.sort((a, b) -> Integer.compare(b[0], a[0]));

        StringBuilder team2 = new StringBuilder();
        for (int[] entry : list) {
            int idx = entry[1];
            team2.append(names[idx].charAt(0));
        }

        System.out.println(team1);
        System.out.println(team2);
    }
}
