/*Create a program to count the number of digits in an integer.
Hint =>
a. Get an integer input for the number variable.
b. Create an integer variable count with value 0.
c. Use a loop to iterate until number is not equal to 0.
d. Remove the last digit from number in each iteration
e. Increase count by 1 in each iteration.
f. Finally display the count to show the number of digits */
import java.util.Scanner;
public class Que_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int count = 0;
        int tempNumber = Math.abs(number); // Handle negative numbers
        
        if (tempNumber == 0) {
            count = 1; // Special case for 0
        } else {
            while (tempNumber != 0) {
                tempNumber /= 10; // Remove the last digit
                count++; // Increment count
            }
        }
        
        System.out.println("The number of digits in " + number + " is: " + count);
        
        scanner.close();
    }
}
