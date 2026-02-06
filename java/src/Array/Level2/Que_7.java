/*7. Rewrite the above program using multi-dimensional array to store height, weight, and BMI in
2D array for all the persons
Hint =>
a. Take input for a number of persons
b. Create a multi-dimensional array to store weight, height and BMI. Also create an to store
the weight status of the persons
double[][] personData = new double[number][3];
String[] weightStatus = new String[number];
c. Take input for weight and height of the persons and for negative values, ask the user to
enter positive values
d. Calculate BMI of all the persons and store them in the personData array and also find
the weight status and put them in the weightStatus array
e. Display the height, weight, BMI and status of each person*/
package Array.Level2;
import java.util.Scanner;
public class Que_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            double weight = scanner.nextDouble();
            while (weight <= 0) {
                System.out.print("Please enter a positive value for weight: ");
                weight = scanner.nextDouble();
            }

            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            double height = scanner.nextDouble();
            while (height <= 0) {
                System.out.print("Please enter a positive value for height: ");
                height = scanner.nextDouble();
            }

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nPerson Data:");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d: Weight: %.2f kg, Height: %.2f m, BMI: %.2f, Status: %s%n",
                    i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}

