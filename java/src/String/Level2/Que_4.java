/*Write a program to split the text into words and find the shortest and longest strings in a
given text
Hint =>
a. Take user input using the Scanner nextLine() method
b. Create a Method to split the text into words using the charAt() method without using the
String built-in split() method and return the words.
c. Create a method to find and return a string's length without using the length() method.
d. Create a method to take the word array and return a 2D String array of the word and its
corresponding length. Use String built-in function String.valueOf() to generate the String
value for the number
e. Create a Method that takes the 2D array of word and corresponding length as
parameters, find the shortest and longest string and return them in an 1D int array.
f. The main function calls the user-defined methods and displays the result. */
package String.Level2;
import java.util.Scanner;
public class Que_4 {
    public static int getStringLength(String str) {
        int count = 0;
        try {
            for (int i = 0; ; i++) {
                str.charAt(i);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {

        }
        return count;
    }

    public static String[] splitTextIntoWords(String text) {
        String[] words = new String[100];
        int wordCount = 0;
        String currentWord = "";

        for (int i = 0; i < getStringLength(text); i++) {
            char ch = text.charAt(i);

            if (ch == ' ') {
                if (getStringLength(currentWord) > 0) {
                    words[wordCount] = currentWord;
                    wordCount++;
                    currentWord = "";
                }
            } else {
                currentWord += ch;
            }
        }

        if (getStringLength(currentWord) > 0) {
            words[wordCount] = currentWord;
            wordCount++;
        }

        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = words[i];
        }

        return result;
    }

    public static String[][] createWord2DArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }

        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordArray) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 0; i < wordArray.length; i++) {
            int currentLength = Integer.parseInt(wordArray[i][1]);
            int shortestLength = Integer.parseInt(wordArray[shortestIndex][1]);
            int longestLength = Integer.parseInt(wordArray[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[] words = splitTextIntoWords(text);

        System.out.println("\nWords found: " + words.length);
        for (String word : words) {
            System.out.println("- " + word);
        }

        String[][] wordArray = createWord2DArray(words);

        System.out.println("\nWord details:");
        for (String[] pair : wordArray) {
            System.out.println("Word: " + pair[0] + " | Length: " + pair[1]);
        }

        int[] indices = findShortestAndLongest(wordArray);
        String shortest = wordArray[indices[0]][0];
        String longest = wordArray[indices[1]][0];

        System.out.println("\nShortest word: " + shortest + " (Length: "
                + wordArray[indices[0]][1] + ")");
        System.out.println("Longest word: " + longest + " (Length: "
                + wordArray[indices[1]][1] + ")");

        scanner.close();
    }
}
