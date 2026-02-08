/*Write a program to find vowels and consonants in a string and display the count of Vowels
and Consonants in the string
Hint =>
a. Create a method to check if the character is a vowel or consonant and return the result.
The logic used here is as follows:
i. Convert the character to lowercase if it is an uppercase letter using the ASCII values
of the characters
ii. Check if the character is a vowel or consonant and return Vowel, Consonant, or Not
a Letter
b. Create a Method to Method to find vowels and consonants in a string using charAt()
method and finally return the count of vowels and consonants in an array
c. Finally, the main function takes user inputs, calls the user-defined methods, and displays
the result.*/
package String.Level2;
import java.util.Scanner;
public class Que_5 {
    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static int[] findVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String result = checkCharacter(ch);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int[] counts = findVowelsAndConsonants(inputString);
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        scanner.close();
    }
}
