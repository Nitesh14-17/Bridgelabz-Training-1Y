/* Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n
Natural Numbers.
Hint =>
a. Take the user input number and check whether it's a Natural number
b. If it's a natural number Compute using formulae as well as compute using for loop
c. Compare the two results and print the result*/
import java.util.Scanner;
public class Que_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        if (number >= 0) {
            int formulaSum = number * (number + 1) / 2;

            int loopSum = 0;
            for (int counter = 1; counter <= number; counter++) {
                loopSum += counter;
            }
            
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);
            
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a discrepancy between the two computations.");
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        
        scanner.close();
    }
}
