/*Write a program to create a substring from a String using the charAt() method. Also, use
the String built-in method substring() to find the substring of the text. Finally Compare the
the two strings and display the results
Hint =>
a. Take user input using the Scanner next() method to take the String variable and also
the start and the end index to get the substring from the given text
b. Write a method to create a substring from a string using the charAt() method with the
string, start, and end index as the parameters
c. Write a method to compare two strings using the charAt() method and return a boolean
result
d. Use the String built-in method substring() to get the substring and compare the two
strings. And finally display the result */
package String.Level1;
import java.util.Scanner;
public class Que_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();

        String substringCharAt = createSubstringUsingCharAt(inputString, startIndex, endIndex);
        System.out.println("Substring using charAt(): " + substringCharAt);

        String substringBuiltIn = inputString.substring(startIndex, endIndex);
        System.out.println("Substring using built-in substring(): " + substringBuiltIn);

        boolean areEqual = compareStrings(substringCharAt, substringBuiltIn);
        System.out.println("Are the two substrings equal? " + areEqual);

        scanner.close();
    }

    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
