/* Write a program to find the sum of numbers until the user enters 0
Hint =>
a. Create a variable total of type double initialize to 0.0. Also, create a variable to store the
double value the user enters
b. Use the while loop to check if the user entered is 0
c. If the user entered value is not 0 then inside the while block add user entered value to
the total and ask the user to input again
d. The loop will continue till the user enters zero and outside the loop display the total value*/
import java.util.Scanner;
public class Que_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double userInput;

        System.out.print("Enter a number (0 to stop): ");
        userInput = scanner.nextDouble();

        while (userInput != 0) {
            total += userInput;
            System.out.print("Enter a number (0 to stop): ");
            userInput = scanner.nextDouble();
        }

        System.out.println("The total sum is: " + total);
        scanner.close();
    }
}
