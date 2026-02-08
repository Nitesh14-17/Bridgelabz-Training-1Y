/*Write a program to split the text into words, compare the result with the split() method and
display the result
Hint =>
a. Take user input using the Scanner nextLine() method
b. Create a Method to find the length of the String without using the built-in length()
method.
c. Create a Method to split the text into words using the charAt() method without using the
String built-in split() method and return the words. Use the following logic
i. Firstly Count the number of words in the text and create an array to store the
indexes of the spaces for each word in a 1D array
ii. Then Create an array to store the words and use the indexes to extract the words
d. Create a method to compare the two String arrays and return a boolean
e. The main function calls the user-defined method and the built-in split() method. Call the
user defined method to compare the two string arrays and display the result*/
package String.Level2;
import java.util.Scanner;
public class Que_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        String[] customSplitWords = customSplit(input);
        String[] builtInSplitWords = input.split(" ");

        boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);
        System.out.println("Are the two split methods equal? " + areEqual);
    }

    public static int customLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {

        }
        return length;
    }

    public static String[] customSplit(String str) {
        int wordCount = 1;
        for (int i = 0; i < customLength(str); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        int startIndex = 0;

        for (int i = 0; i <= customLength(str); i++) {
            if (i == customLength(str) || str.charAt(i) == ' ') {
                words[wordIndex] = str.substring(startIndex, i);
                wordIndex++;
                startIndex = i + 1;
            }
        }

        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}