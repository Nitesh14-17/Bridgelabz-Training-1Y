/*9. Rewrite the above program to store the marks of the students in physics, chemistry, and
maths in a 2D array and then compute the percentage and grade
Hint =>
a. All the steps are the same as the problem 8 except the marks are stored in a 2D array
b. Use the 2D array to calculate the percentages, and grades of the students */
package Array.Level2;
import java.util.Scanner;
public class Que_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[5][3];
        String[] subjects = {"Physics", "Chemistry", "Maths"};

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(subjects[j] + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < marks.length; i++) {
            int totalMarks = 0;
            for (int j = 0; j < marks[i].length; j++) {
                totalMarks += marks[i][j];
            }
            double percentage = (totalMarks / 300.0) * 100;
            String grade;

            if (percentage >= 90) {
                grade = "A";
            } else if (percentage >= 80) {
                grade = "B";
            } else if (percentage >= 70) {
                grade = "C";
            } else if (percentage >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Student " + (i + 1) + ": Percentage = " + percentage + "%, Grade = " + grade);
        }

        sc.close();
    }
}

