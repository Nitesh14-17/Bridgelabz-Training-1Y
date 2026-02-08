/*Write a program to take user input for the age of all 10 students in a class and check
whether the student can vote depending on his/her age is greater or equal to 18.
Hint =>
a. Create a method to define the random 2-digit age of several students provided as
method parameters and return a 1D array of ages of n students
b. Create a method that takes an array of age as a parameter and returns a 2D String array
of age and a boolean true or false to indicate can and cannot vote. Inside the method
firstly validate the age for a negative number, if a negative cannot vote. For valid age
check for age is 18 or above to set true to indicate can vote.
c. Create a method to display the 2D array in a tabular format.
d. Finally, the main function takes user inputs, calls the user-defined methods, and displays
the result. */
package String.Level2;
import java.util.Random;
import java.util.Scanner;
public class Que_8 {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(83) + 18;
        }
        return ages;
    }
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s%n", "Age", "Can Vote");
        System.out.println("---------------------");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        int[] ages = generateAges(n);
        String[][] votingResults = checkVotingEligibility(ages);
        displayResults(votingResults);

        scanner.close();
    }

}
