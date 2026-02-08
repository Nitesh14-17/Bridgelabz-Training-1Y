/*10. Write a program to convert the complete text to lowercase and compare the results
Hint =>
a. Take user input using the Scanner nextLine() method to take the complete text into a
String variable
b. Write a method using the String built-in charAt() method to convert each character if it
is uppercase to the lowercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the
difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and
so on
c. Write a method to compare two strings using the charAt() method and return a boolean
result
d. In the main() use the String built-in method toLowerCase() to get the lowercase text
and compare the two strings using the user-defined method. And finally display the result*/
package String.Level1;
import java.util.Scanner;
public class Que_10 {
    public static String convertToLowercase(String input) {
        StringBuilder lowerCaseString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            lowerCaseString.append(ch);
        }
        return lowerCaseString.toString();
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the complete text:");
        String userInput = scanner.nextLine();

        String convertedText = convertToLowercase(userInput);

        String builtInLowercaseText = userInput.toLowerCase();

        boolean areEqual = compareStrings(convertedText, builtInLowercaseText);

        if (areEqual) {
            System.out.println("The two lowercase conversions are equal.");
        } else {
            System.out.println("The two lowercase conversions are not equal.");
        }

        scanner.close();
    }
}
