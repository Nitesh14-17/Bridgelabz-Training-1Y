/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in
a team of 10 members. For this create a program to find the BMI and display the height,
weight, BMI, and status of each individual
Hint =>
a. Take user input for the person's weight (kg) and height (cm) and store it in the
corresponding 2D array of 10 rows. The First Column stores the weight and the second
column stores the height in cm
b. Create a Method to find the BMI and status of every person given the person's height
and weight and return the 2D String array. Use the formula BMI = weight / (height *
height). Note unit is kg/m^2. For this convert cm to meter
c. Create a Method that takes the 2D array of height and weight as parameters. Calls the
user-defined method to compute the BMI and the BMI Status and stores in a 2D String
array of height, weight, BMI, and status.
d. Create a method to display the 2D string array in a tabular format of Person's Height,
Weight, BMI, and the Status
e. Finally, the main function takes user inputs, calls the user-defined methods, and displays
the result. */
package String.Level3;
import java.util.Scanner;
public class Que_1 {
    static String[][] calculateBMI(double[][] hwArray) {
        String[][] result = new String[hwArray.length][4];
        for (int i = 0; i < hwArray.length; i++) {
            double weight = hwArray[i][0];
            double heightInMeters = hwArray[i][1] / 100.0; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            String status;

            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.format("%.2f", weight);
            result[i][1] = String.format("%.2f", hwArray[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    static String[][] processBMI(double[][] hwArray) {
        return calculateBMI(hwArray);
    }

    static void displayResults(String[][] bmiArray) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (String[] row : bmiArray) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] hwArray = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            hwArray[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            hwArray[i][1] = scanner.nextDouble();
        }

        String[][] bmiResults = processBMI(hwArray);
        displayResults(bmiResults);
    }
}

