/*3. Create a program to print a multiplication table of a number.
Hint =>
a. Get an integer input and store it in the number variable. Also, define a integer array to
store the results of multiplication from 1 to 1
b. Run a loop from 1 to 10 and store the results in the multiplication table array
c. Finally, display the result from the array in the format number * i = ___ */
package Array.Level1;
import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int[] multiplicationTable = new int[10];

        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        scanner.close();
    }
}

