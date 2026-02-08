/*Write a program to convert the complete text to uppercase and compare the results
Hint =>
a. Take user input using the Scanner nextLine() method to take the complete text into a
String variable
b. Write a method using the String built-in charAt() method to convert each character if it
is lowercase to the uppercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the
difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and
so on
c. Write a method to compare two strings using the charAt() method and return a boolean
result
d. In the main() use the String built-in method toUpperCase() to get the uppercase text
and compare the two strings using the user-defined method. And finally display the result*/
package String.Level1;
import java.util.Scanner;
public class Que_9 {
    public static String convertToUppercase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
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

        String convertedText = convertToUppercase(userInput);

        String upperCaseText = userInput.toUpperCase();

        boolean areEqual = compareStrings(convertedText, upperCaseText);

        if (areEqual) {
            System.out.println("The converted text matches the built-in uppercase text.");
        } else {
            System.out.println("The converted text does not match the built-in uppercase text.");
        }

        scanner.close();
    }
}
