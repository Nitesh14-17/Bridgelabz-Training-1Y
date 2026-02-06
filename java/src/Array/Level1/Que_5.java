/*5. Create a program to find the multiplication table of a number entered by the user from 6 to 9
and display the result
Hint =>
a. Take integer input and store it in the variable number as well as define an integer array
to store the multiplication result in the variable multiplicationResult
b. Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result
in the array
c. Finally, display the result from the array in the format number * i = ___*/
package Array.Level1;
import java.util.Scanner;
public class Que_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4];

        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; // Store result in array
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        scanner.close();
    }
}
