/*Write a program to find the frequency of characters in a string using nested loops and
display the result
Hint =>
a. Create a method to find the frequency of characters in a string and return the characters
and their frequencies in a 1D array. The logic used here is as follows:
i. Create an array to store the frequency of each character in the text and an array to
store the characters in the text using the toCharArray() method
ii. Loops to Find the frequency of each character in the text and store the result in a
frequency array. For this use a Nested Loop with an Outer loop to iterate through
each character in the text and initialize the frequency of each character to 1. And an
Inner loop to check for duplicate characters. In case of duplicate increment the
frequency value and set the duplicate characters to '0' to avoid counting them again.
iii. Create a 1D String array to store the characters and their frequencies. For this
Iterate through the characters in the text and store the characters and their
frequencies
b. Finally, the main function takes user inputs, calls the user-defined methods, and displays
the result. */
package String.Level3;
import java.util.Scanner;
public class Que_6 {public static String[] findFrequency(String str) {
    char[] chars = str.toCharArray();
    int[] freq = new int[chars.length];
    String[] result = new String[chars.length];

    for (int i = 0; i < chars.length; i++) {
        freq[i] = 1;
        for (int j = i + 1; j < chars.length; j++) {
            if (chars[i] == chars[j] && chars[i] != '0') {
                freq[i]++;
                chars[j] = '0';
            }
        }
    }

    int index = 0;
    for (int i = 0; i < chars.length; i++) {
        if (chars[i] != '0') {
            result[index++] = chars[i] + ": " + freq[i];
        }
    }

    String[] finalResult = new String[index];
    System.arraycopy(result, 0, finalResult, 0, index);
    return finalResult;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] frequencies = findFrequency(input);

        System.out.println("Character Frequencies:");
        for (String freq : frequencies) {
            System.out.println(freq);
        }

        scanner.close();
    }
}
