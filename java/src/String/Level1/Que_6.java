/*Write a program to demonstrate IllegalArgumentException
Hint =>
a. Define a variable of type String and take user input to assign a value
b. Write a Method to generate the Exception. Here use the subString() and set the start
index to be greater than the end index. This will generate a runtime exception and
abruptly stop the program.
c. Write the Method to demonstrate IllegalArgumentException. Here use the
subString() and set the start index to be greater than the end index. This will generate
a runtime exception. Use the try-catch block to handle the IllegalArgumentException
and the generic runtime exception
d. From the main Firstly call the method to generate the Exception then call the method to
handle the RuntimeException*/
package String.Level1;
import java.util.Scanner;
public class Que_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        generateException(userInput);

        handleException(userInput);

        scanner.close();
    }

    public static void generateException(String str) {

        String subStr = str.substring(5, 2);
        System.out.println("Substring: " + subStr);
    }

    public static void handleException(String str) {
        try {

            String subStr = str.substring(5, 2);
            System.out.println("Substring: " + subStr);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }
}
