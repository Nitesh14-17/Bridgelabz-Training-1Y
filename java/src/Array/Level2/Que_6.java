/* 6. An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in
the team. For this create a program to find the BMI and display the height, weight, BMI and
status of each individual
Hint =>
a. Take input for a number of persons
b. Create arrays to store the weight, height, BMI, and weight status of the persons
c. Take input for the weight and height of the persons
d. Calculate the BMI of all the persons and store them in an array and also find the weight
status of the persons
e. Display the height, weight, BMI, and weight status of each person
f. Use the table to determine the weight status of the person
<=UnderWeightt
18.5-24.9 Normal
25.0-39.9 Overweight
>=40.0  Obese*/
package Array.Level2;
import java.util.Scanner;
public class Que_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", height[i], weight[i], bmi[i], status[i]);
        }

        sc.close();
    }

}
