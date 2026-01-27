/*Rewrite program 14 using for loop
Hint =>
a. Take the integer input, check for natural number and determine the factorial using for
loop and finally print the result. */
import java.util.Scanner;
public class Que_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number to find its factorial: ");
        int number = scanner.nextInt();
        
        if (number >= 0) {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        
        scanner.close();
    }
}

