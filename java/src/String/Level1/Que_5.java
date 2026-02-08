/*Write a program to demonstrate StringIndexOutOfBoundsException
Hint =>
a. Define a variable of type String and take user input to assign a value
b. Write a Method to generate the Exception. Access the index using charAt() beyond the
length of the String. This will generate a runtime exception and abruptly stop the
program.
c. Write the Method to demonstrate StringIndexOutOfBoundsException. Access the
index using charAt() beyond the length of the String. Then write try catch block for
Exception while accessing the String method
d. From the main Firstly call the method to generate the Exception then call the method to
handle the RuntimeException */
package String.Level1;
import java.util.Scanner;
public class Que_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        generateException(userInput);

        handleException(userInput);

        scanner.close();
    }

    public static void generateException(String str) {
        // Accessing an index beyond the length of the string
        System.out.println("Character at index 10: " + str.charAt(10));
    }

    public static void handleException(String str) {
        try {

            System.out.println("Character at index 10: " + str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
