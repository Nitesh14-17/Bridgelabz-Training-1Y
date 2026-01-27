/* Write a Program to find the factorial of an integer entered by the user.
Hint =>
a. For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
b. Take an integer input from the user and assign it to the variable. Check the user has
entered a positive integer.
c. Using a while loop, compute the factorial.
d. Print the factorial at the end.*/
import java.util.Scanner;
public class Que_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its factorial: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            int counter = 1;
            
            while (counter <= number) {
                factorial *= counter;
                counter++;
            }
            
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        
        scanner.close();
    }
}
