import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int[][] A = new int[n1][m1];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int m2 = sc.nextInt();
        int k = sc.nextInt();
        int[][] B = new int[m2][k];

        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < k; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[n1][k];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < m1; l++) {
                    result[i][j] += A[i][l] * B[l][j];
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < k; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
