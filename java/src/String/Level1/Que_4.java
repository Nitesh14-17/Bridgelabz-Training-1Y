/* Write a program to demonstrate NullPointerException.
Hint =>
a. Write a Method to generate the Exception. Here define the variable text and initialize it to
null. Then call one of the String Method to generate the exception
e. Write the Method to demonstrate NullPointerException. Here define the variable text
and initialize it to null. Then write try catch block for handling the Exception while
accessing one of the String method
b. From the main Firstly call the method to generate the Exception then refactor the code to
call the method to handle the RuntimeException*/
package String.Level1;
import java.util.Scanner;
public class Que_4 {
    public static void generateNullPointerException() {
        String text = null;

        System.out.println(text.length());
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        handleNullPointerException();
    }

}
