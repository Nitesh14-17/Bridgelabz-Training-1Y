/*Find unique characters in a string using the charAt() method and display the result
Hint =>
a. Create a Method to find the length of the text without using the String method length()
b. Create a method to Find unique characters in a string using the charAt() method and
return them as a 1D array. The logic used here is as follows:
i. Create an array to store the unique characters in the text. The size is the length of
the text
ii. Loops to Find the unique characters in the text. Find the unique characters in the text
using a nested loop. An outer loop iterates through each character and an inner loop
checks if the character is unique by comparing it with the previous characters. If the
character is unique, it is stored in the result array
iii. Create a new array to store the unique characters
c. Finally, the main function */
package String.Level3;
import java.util.Scanner;
public class Que_2 {public static int findLength(String text) {
    int length = 0;
    try {
        while (true) {
            text.charAt(length);
            length++;
        }
    } catch (IndexOutOfBoundsException e) {

    }
    return length;
}

    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        for (int k = 0; k < uniqueCount; k++) {
            result[k] = uniqueChars[k];
        }

        return result;
    }

    public static void main(String[] args) {
        String text = "programming";
        char[] uniqueCharacters = findUniqueCharacters(text);

        System.out.print("Unique characters in the string: ");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }
    }
}
