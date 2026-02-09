/* Write a program to find the first non-repeating character in a string and show the result
Hint =>
a. Non-repeating character is a character that occurs only once in the string
b. Create a Method to find the first non-repeating character in a string using the charAt()
method and return the character. The logic used here is as follows:
i. Create an array to store the frequency of characters in the text. ASCII values of
characters are used as indexes in the array to store the frequency of each character.
There are 256 ASCII characters
ii. Loop through the text to find the frequency of characters in the text
iii. Loop through the text to find the first non-repeating character in the text by checking
the frequency of each character
c. In the main function take user inputs, call user-defined methods, and displays result.*/


package String.Level3;
import java.util.Scanner;
public class Que_3 {
    public static char firstNonRepeatingCharacter(String str) {
        int[] charFrequency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            charFrequency[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (charFrequency[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        char result = firstNonRepeatingCharacter(inputString);
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("There are no non-repeating characters in the string.");
        }

        scanner.close();
    }
}
