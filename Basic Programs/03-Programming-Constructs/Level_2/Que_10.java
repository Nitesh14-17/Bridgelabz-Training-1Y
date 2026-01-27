/* Rewrite the above program to print the greatest factor of a number beside itself using a
while loop.
Hint =>
a. Get an integer input and assign it to the number variable. As well as define a
greatestFactor variable and assign it to 1
b. Create a variable counter and assign counter = number - 1; Use the while loop till
the counter is equal to 1.
e. Inside the loop, check if the number is perfectly divisible by the counter then assign the
counter to greatestFactor variable and break the loop.
f. Display the greatestFactor variable outside the loop*/
import java.util.Scanner;
public class Que_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        if (number > 1) {
            int greatestFactor = 1;
            int counter = number - 1;
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        } else {
            System.out.println("Please enter a positive integer greater than 1.");
        }
        
        scanner.close();
    }
}
