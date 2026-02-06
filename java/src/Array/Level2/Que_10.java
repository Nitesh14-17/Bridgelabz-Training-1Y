/*10. Create a program to take a number as input find the frequency of each digit in the number
using an array and display the frequency of each digit
Hint =>
a. Take the input for a number
b. Find the count of digits in the number
c. Find the digits in the number and save them in an array
d. Find the frequency of each digit in the number. For this define a frequency array of size
10, Loop through the digits array, and increase the frequency of each digit
e. Display the frequency of each digit in the number*/
package Array.Level2;
import java.util.Scanner;
public class Que_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        int[] frequency = new int[10];

        for (char digit : number.toCharArray()) {
            if (Character.isDigit(digit)) {
                frequency[digit - '0']++;
            }
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(i + ": " + frequency[i]);
        }

        scanner.close();
    }
}