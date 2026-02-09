/*Write a program to find the frequency of characters in a string using unique characters and
display the result
Hint =>
a. Create a method to Find unique characters in a string using the charAt() method and
return them as a 1D array. Use Nested Loops to find the unique characters in the text
b. Create a method to find the frequency of characters in a string and return the characters
and their frequencies in a 2D array. The logic used here is as follows:
i. Create an array to store the frequency of characters in the text. ASCII values of
characters are used as indexes in the array to store the frequency of each character.
There are 256 ASCII characters
ii. Loop through the text to find the frequency of characters in the text
iii. Call the uniqueCharacters() method to find the unique characters in the text
iv. Create a 2D String array to store the unique characters and their frequencies.
v. Loop through the unique characters and store the characters and their frequencies
c. In the main function take user inputs, call user-defined methods, and displays result. */
package String.Level3;
import java.util.Scanner;
public class Que_5 {
    public static char[] uniqueCharacters(String str) {
        StringBuilder uniqueChars = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (uniqueChars.indexOf(String.valueOf(ch)) == -1) {
                uniqueChars.append(ch);
            }
        }
        return uniqueChars.toString().toCharArray();
    }

    public static String[][] characterFrequency(String str) {
        int[] freq = new int[256]; // ASCII size
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(str);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencies = characterFrequency(input);

        System.out.println("Character Frequencies:");
        for (String[] pair : frequencies) {
            System.out.println("Character: " + pair[0] + ", Frequency: " + pair[1]);
        }

        scanner.close();
    }
}
