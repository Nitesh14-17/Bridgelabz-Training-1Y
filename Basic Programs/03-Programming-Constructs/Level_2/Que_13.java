/*Rewrite the program to find all the multiples of a number below 100 using while loop.
Hint =>
a. Get the input value for a variable named number. Check the number is a positive integer
and less than 100.
b. Create a counter variable and assign counter = number - 1; Use a while till the
counter is > 1
c. Inside the loop, check if the counter perfectly divides the number. If true, print the
number and continue the loop. */
import java.util.Scanner;
public class Que_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();
        
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");
            int counter = 99;
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer less than 100");
        }
        
        scanner.close();
    }
}
