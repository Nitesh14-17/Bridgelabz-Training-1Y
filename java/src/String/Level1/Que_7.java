/*Write a program to demonstrate NumberFormatException
Hint =>
a. Define a variable to take user input as a String
b. Use Integer.parseInt() to generate this exception. Integer.parseInt() is a built-in
function in java.lang.Integer class to extract the number from text. In case the text does
not contain numbers the method will throw NumberFormatException which is a runtime
exception
c. Write a Method to generate the Exception. Use Integer.parseInt(text) to extract
number from the text. This will generate a runtime exception and abruptly stop the
program.
d. Write the Method to demonstrate NumberFormatException. Use
Integer.parseInt(text) to extract number from the text. This will generate a runtime
exception. Use the try-catch block to handle the NumberFormatException as well as
the generic runtime exception
e. From the main Firstly call the method to generate the Exception then call the method to
handle the RuntimeException*/
package String.Level1;
import java.util.Scanner;
public class Que_7 {
    public static void generateException(String text) {

        int number = Integer.parseInt(text);
        System.out.println("Extracted number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Extracted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to extract number: ");
        String userInput = scanner.nextLine();

        System.out.println("Generating Exception:");
        try {
            generateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("\nHandling Exception:");
        handleException(userInput);

        scanner.close();
    }
}
