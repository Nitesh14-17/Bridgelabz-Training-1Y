/*7. Create a program to find the BMI of a person
Hint =>
a. Take user input in double for the weight (in kg) of the person and height (in cm) for the
person and store it in the corresponding variable.
b. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm
to meter
c. Use the table to determine the weight status of the person

BMI              Status

≤ 18.4           Underweight

18.5 - 24.9      Normal

25.0 - 39.9      Overweight

≥ 40.0           Obese
*/
import java.util.Scanner;
public class Que_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();
        
        double heightM = heightCm / 100;

        double bmi = weight / (heightM * heightM);
 
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

        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);
        
        scanner.close();
    }
}