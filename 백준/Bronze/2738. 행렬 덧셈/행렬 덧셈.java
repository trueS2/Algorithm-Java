import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matrix1 = new int[N][M];
        int[][] matrix2 = new int[N][M];
        int[][] result = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }

    }
}