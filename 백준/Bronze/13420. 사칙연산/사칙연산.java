import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < T; i++) {
            String[] parts = scanner.nextLine().split(" ");
            long operand1 = Long.parseLong(parts[0]);
            String operator = parts[1];
            long operand2 = Long.parseLong(parts[2]);
            long result = Long.parseLong(parts[4]);

            boolean isCorrect = false;
            switch (operator) {
                case "+":
                    isCorrect = (operand1 + operand2 == result);
                    break;
                case "-":
                    isCorrect = (operand1 - operand2 == result);
                    break;
                case "*":
                    isCorrect = (operand1 * operand2 == result);
                    break;
                case "/":
                    isCorrect = (operand1 / operand2 == result);
                    break;
            }
            
            if (isCorrect) {
                System.out.println("correct");
            } else {
                System.out.println("wrong answer");
            }
        }
        
        scanner.close();
    }
}
