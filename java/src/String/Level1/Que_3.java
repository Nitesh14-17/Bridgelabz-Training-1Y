/* Write a program to return all the characters in a string using the user-defined method,
compare the result with the String built-in toCharArray() method, and display the result
Hint =>
a. Take user input using the Scanner next() method to take the text into a String variable
b. Write a method to return the characters in a string without using the toCharArray()
c. Write a method to compare two string arrays and return a boolean result
d. In the main() call the user-defined method and the String built-in toCharArray() method,
compare the 2 arrays, and finally display the result*/
package String.Level1;
import java.util.Scanner;
public class Que_3 {
    public static char[] customToCharArray(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        char[] customArray = customToCharArray(inputString);
        char[] builtInArray = inputString.toCharArray();

        boolean areEqual = compareCharArrays(customArray, builtInArray);

        if (areEqual) {
            System.out.println("The character arrays are equal.");
        } else {
            System.out.println("The character arrays are not equal.");
        }

        scanner.close();
    }
}
