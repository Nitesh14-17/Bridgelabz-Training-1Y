/*Write a program to trim the leading and trailing spaces from a string using the charAt()
method
Hint =>
a. Create a method to trim the leading and trailing spaces from a string using the charAt()
method. Inside the method run a couple of loops to trim leading and trailing spaces and
determine the starting and ending points with no spaces. Return the start point and end
point in an array
b. Write a method to create a substring from a string using the charAt() method with the
string, start, and end index as the parameters
c. Write a method to compare two strings using the charAt() method and return a boolean
result
d. The main function calls the user-defined trim and substring methods to get the text after
trimming the leading and trailing spaces. Post that use the String built-in method trim()
to trim spaces and compare the two strings. And finally display the result */
package String.Level2;
public class Que_7 {public static void main(String[] args) {
    String str = "   Hello, World!   ";

    int[] trimIndices = trimSpaces(str);
    String trimmedUsingCharAt = substringUsingCharAt(str, trimIndices[0], trimIndices[1]);
    String trimmedUsingBuiltIn = str.trim();

    boolean areEqual = compareStrings(trimmedUsingCharAt, trimmedUsingBuiltIn);

    System.out.println("Trimmed using charAt(): '" + trimmedUsingCharAt + "'");
    System.out.println("Trimmed using built-in method: '" + trimmedUsingBuiltIn + "'");
    System.out.println("Are both trimmed strings equal? " + areEqual);
}

    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
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

}
