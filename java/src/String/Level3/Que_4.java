/*Write a program to find the frequency of characters in a string using the charAt() method and
display the result
Hint =>
a. Create a method to find the frequency of characters in a string using the charAt() method
and return the characters and their frequencies in a 2D array. The logic used here is as
follows:
i. Create an array to store the frequency of characters in the text. ASCII values of
characters are used as indexes in the array to store the frequency of each character.
There are 256 ASCII characters
ii. Loop through the text to find the frequency of characters in the text
iii. Create an array to store the characters and their frequencies
iv. Loop through the characters in the text and store the characters and their
frequencies
b. In the main function take user inputs, call user-defined methods, and displays result. */
package String.Level3;
import java.util.Scanner;
public class Que_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int[][] frequencyArray = findCharacterFrequency(inputString);
        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequencyArray.length; i++) {
            System.out.println(frequencyArray[i][0] + " : " + frequencyArray[i][1]);
        }
        scanner.close();
    }

    public static int[][] findCharacterFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[(int) ch]++;
        }

        int uniqueCharCount = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                uniqueCharCount++;
            }
        }

        int[][] charFreqArray = new int[uniqueCharCount][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                charFreqArray[index][0] = i;
                charFreqArray[index][1] = freq[i];
                index++;
            }
        }
        return charFreqArray;
    }
}
