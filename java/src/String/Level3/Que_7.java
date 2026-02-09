/*Write a program to to check if a text is palindrome and display the result
Hint =>
a. A palindrome is a word, phrase, number, or other sequence of characters that reads the
same forward and backward
b. Logic 1: Write a method to compare the characters from the start and end of the string
to determine whether the text is palindrome. The logic used here is as follows:
i. Set the start and end indexes of the text
ii. Loop through the text and compare the characters from the start and the end of the
string. If the characters are not equal, return false
c. Logic 2: Write a recursive method to compare the characters from the start and end of
the text passed as parameters using recursion. The logic used here is as follows:
i. First, check if the start index is greater than or equal to the end index, then return
true.
ii. If the characters at the start and end indexes are not equal, return false.
iii. Otherwise, call the method recursively with the start index incremented by 1 and the
end index
d. Logic 3: Write a Method to compare the characters from the start and end of the text
using character arrays. The logic used here is as follows:
i. Firstly Write a Method to reverse a string using the charAt() method and return the
reversal array.
ii. Create a character array using the String method toCharArray() and also create a
reverse array. Compare the characters in the original and reverse arrays to do a
Palindrome check
e. Finally, in the main method do palindrome check using the three logic and display result */
package String.Level3;
import java.util.Scanner;
public class Que_7 {
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeCharArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text to check if it's a palindrome: ");
        String text = scanner.nextLine();

        boolean resultIterative = isPalindromeIterative(text);
        System.out.println("Using Iterative Method: " + (resultIterative ? "Palindrome" : "Not a Palindrome"));

        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Using Recursive Method: " + (resultRecursive ? "Palindrome" : "Not a Palindrome"));

        boolean resultCharArray = isPalindromeCharArray(text);
        System.out.println("Using Character Array Method: " + (resultCharArray ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }
}
