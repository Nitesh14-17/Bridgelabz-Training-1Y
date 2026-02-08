/*Write a program to split the text into words and return the words along with their lengths in a
2D array
Hint =>
a. Take user input using the Scanner nextLine() method
b. Create a Method to split the text into words using the charAt() method without using the
String built-in split() method and return the words.
c. Create a method to find and return a string's length without using the length() method.
d. Create a method to take the word array and return a 2D String array of the word and its
corresponding length. Use String built-in function String.valueOf() to generate the String
value for the number
e. The main function calls the user-defined method and displays the result in a tabular
format. During display make sure to convert the length value from String to Integer and
then display */
package String.Level2;
import java.util.Scanner;
public class Que_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        String[] words = splitIntoWords(input);
        String[][] wordLengths = getWordLengths(words);

        System.out.printf("%-15s %-10s%n", "Word", "Length");
        System.out.println("-------------------------");
        for (String[] pair : wordLengths) {
            System.out.printf("%-15s %-10d%n", pair[0], Integer.parseInt(pair[1]));
        }
        scanner.close();
    }

    public static String[] splitIntoWords(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord.append(ch);
            } else {
                words[index++] = currentWord.toString();
                currentWord.setLength(0);
            }
        }
        words[index] = currentWord.toString();
        return words;
    }

    public static int getStringLength(String str) {
        int length = 0;
        for (char ch : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }
}
