/*Write a program to compare two strings using the charAt() method and check the result
with the built-in String equals() method
Hint =>
a. Take user input using the Scanner next() method for 2 String variables
b. Write a method to compare two strings using the charAt() method and return a boolean
result
c. Use the String Built-In method to check if the results are the same and display the result*/
package String.Level1;
import java.util.Scanner;
public class Que_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        boolean charAtComparisonResult = compareStringsUsingCharAt(str1, str2);

        boolean equalsComparisonResult = str1.equals(str2);

        System.out.println("Comparison using charAt() method: " + charAtComparisonResult);
        System.out.println("Comparison using equals() method: " + equalsComparisonResult);

        if (charAtComparisonResult == equalsComparisonResult) {
            System.out.println("Both comparison methods yield the same result.");
        } else {
            System.out.println("The comparison methods yield different results.");
        }

        scanner.close();
    }

    public static boolean compareStringsUsingCharAt(String str1, String str2) {
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
