/*Write a program to check if two texts are anagrams and display the result
Hint =>
a. An anagram is a word or phrase formed by rearranging the same letters to form different
words or phrases,
b. Write a method to check if two texts are anagrams. The logic used here is as follows:
i. Check if the lengths of the two texts are equal
ii. Create an array to store the frequency of characters in the strings for the two text
iii. Find the frequency of characters in the two texts using the loop
iv. Compare the frequency of characters in the two texts. If the frequencies are not
equal, return false
c. In the main function take user inputs, call user-defined methods, and displays result. */
package String.Level3;
import java.util.Scanner;
import java.util.Arrays;
public class Que_8 {
    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        return Arrays.equals(frequency1, frequency2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}
