import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, Double> gradeMap = new HashMap<>();
        
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double totalScore = 0;
        double totalCredit = 0;

        for (int i = 0; i < 20; i++) {
            String subject = scanner.next();
            double credit = scanner.nextDouble();
            String grade = scanner.next();
            
            if (!grade.equals("P")) {
                totalScore += credit * gradeMap.get(grade);
                totalCredit += credit;
            }
        }
        
        scanner.close();
        System.out.println(totalScore / totalCredit);
    }
}
