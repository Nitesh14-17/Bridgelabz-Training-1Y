/*8. Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint =>
a. Define a variable of array of names and take input from the user
b. Write a Method to generate the Exception. Here access index larger then the length of
the array. This will generate a runtime exception and abruptly stop the program.
c. Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access
index larger then the length of the array. This will generate a runtime exception. Use the
try-catch block to handle the ArrayIndexOutOfBoundsException and the generic
runtime exception
d. From the main Firstly call the method to generate the Exception then call the method to
handle the RuntimeException*/
package String.Level1;
import java.util.Scanner;
public class Que_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names you want to input: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        generateException(names);

        handleException(names);

        scanner.close();
    }

    public static void generateException(String[] names) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        System.out.println(names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        System.out.println("Handling ArrayIndexOutOfBoundsException...");
        try {

            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
