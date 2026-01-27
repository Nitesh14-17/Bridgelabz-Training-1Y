/* 12. Write a program to find the sum of n natural numbers using while loop compare the result
with the formulae n*(n+1)/2 and show the result from both computations was correct.
Hint =>
a. Take the user input number and check whether it's a Natural number
b. If it's a natural number Compute using formulae as well as compute using while loop
c. Compare the two results and print the result*/
import java.util.Scanner;
public class Que_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        if (number >= 0) {
            int formulaSum = number * (number + 1) / 2;

            int loopSum = 0;
            int counter = 1;
            while (counter <= number) {
                loopSum += counter;
                counter++;
            }
            

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
            
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
