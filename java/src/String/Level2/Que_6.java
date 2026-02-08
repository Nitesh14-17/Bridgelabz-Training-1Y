/*Write a program to find vowels and consonants in a string and display the character type -
Vowel, Consonant, or Not a Letter
Hint =>
a. Create a method to check if the character is a vowel or consonant and return the result.
The logic used here is as follows:
i. Convert the character to lowercase if it is an uppercase letter using the ASCII values
of the characters
ii. Check if the character is a vowel or consonant and return Vowel, Consonant, or Not
a Letter
b. Create a Method to find vowels and consonants in a string using charAt() method and
return the character and vowel or consonant in a 2D array
c. Create a Method to display the 2D Array of Strings in a Tabular Format
d. Finally, the main function takes user inputs, calls the user-defined methods, and displays
the result. */
package String.Level2;
import java.util.Scanner;
public class Que_6 {
    public static String checkCharacterType(char ch) {
        if (!Character.isLetter(ch)) {
            return "Not a Letter";
        }
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }

    public static String[][] findVowelsAndConsonants(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("-------------------------");
        for (String[] row : arr) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] result = findVowelsAndConsonants(input);
        displayTable(result);

        scanner.close();
    }
}
