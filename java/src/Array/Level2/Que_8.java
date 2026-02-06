/*8. Create a program to take input marks of students in 3 subjects physics, chemistry, and
maths. Compute the percentage and then calculate the grade as per the following
guidelines

Grade

            Remarks                                                             Marks

  A        (Level 4, above agency-normalized standards)                     80% and above
  B        (Level 3, at agency-normalized standards)                          70-79%
  C        (Level 2, below, but approaching agency-normalized standards)      60-69%
  D        (Level 1, well below agency-normalized standards)                  50-59%
  E        (Level 1- , too below agency-normalized standards)                 40-49%
  R        (Remedial standards)                                             39% and below

a. Take input for the number of students
b. Create arrays to store marks, percentages, and grades of the students
c. Take input for marks of students in physics, chemistry, and maths. If the marks are
negative, ask the user to enter positive values and decrement the index
d. Calculate the percentage and grade of the students based on the percentage
e. Display the marks, percentages, and grades of each student



 */
package Array.Level2;
import java.util.Scanner;
public class Que_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        double[] physicsMarks = new double[numStudents];
        double[] chemistryMarks = new double[numStudents];
        double[] mathsMarks = new double[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            physicsMarks[i] = getValidMarks(sc, "Physics");
            chemistryMarks[i] = getValidMarks(sc, "Chemistry");
            mathsMarks[i] = getValidMarks(sc, "Maths");

            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3;
            grades[i] = calculateGrade(percentages[i]);
        }

        System.out.println("\nStudent Marks, Percentages, and Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Student %d: Physics: %.2f, Chemistry: %.2f, Maths: %.2f, Percentage: %.2f%%, Grade: %c%n",
                    (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }

        sc.close();
    }

    private static double getValidMarks(Scanner sc, String subject) {
        double marks;
        do {
            System.out.print(subject + " marks: ");
            marks = sc.nextDouble();
            if (marks < 0) {
                System.out.println("Please enter positive values for marks.");
            }
        } while (marks < 0);
        return marks;
    }

    private static char calculateGrade(double percentage) {
        if (percentage >= 80) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 60) {
            return 'C';
        } else if (percentage >= 50) {
            return 'D';
        } else if (percentage >= 40) {
            return 'E';
        } else {
            return 'R';
        }
    }

}
