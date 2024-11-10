import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        int num1 = Sc.nextInt();
        int num2 = Sc.nextInt();

        int ones = num2 %10;
        int tens = (num2 / 10) % 10;
        int hundreds = num2 / 100;

        int result1 = num1 * ones;
        int result2 = num1 * tens;
        int result3 = num1 * hundreds;

        int finalResult = num1 * num2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(finalResult);


    }
}