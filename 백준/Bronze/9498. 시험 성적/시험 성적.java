import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        int A = Sc.nextInt();

        char grade;
        if (100 >= A && A >= 90){
            grade = 'A';
        } else if (89 >= A && A >= 80){
            grade = 'B';
        } else if (79 >= A && A >= 70){
            grade = 'C';
        } else if (69 >= A && A >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println(grade);

    }
}