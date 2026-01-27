/*Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the
percentage and then calculate the grade as per the following guidelines

Remarks

(Level 4, above agency-normalized standards) 85% and above

(Level 3, at agency-normalized standards) 70% to 79%

(Level 2, below, but approaching agency-normalized standards)60% to 69%

(Level 1, well below agency-normalized standards) 50% to 59%

(Level 1- , too below agency-normalized standards) 40% to 49%

(Remedial standards) Below 40%

a. Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks */
import java.util.Scanner;
public class Que_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();
        
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();
        
        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();
        
        int totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300.0) * 100;
        
        String grade;
        String remarks;
        
        if (percentage >= 85) {
            grade = "Level 4";
            remarks = "Above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "Level 3";
            remarks = "At agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "Level 2";
            remarks = "Below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "Level 1";
            remarks = "Well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "Level 1-";
            remarks = "Too below agency-normalized standards";
        } else {
            grade = "Remedial standards";
            remarks = "Below 40%";
        }
        
        System.out.printf("Average Mark: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        scanner.close();
    }
}
