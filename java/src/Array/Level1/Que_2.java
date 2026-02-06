/*2. Write a program to take user input for 5 numbers and check whether a number is positive,
negative, or zero. Further for positive numbers check if the number is even or odd. Finally
compare the first and last elements of the array and display if they equal, greater or less
Hint =>
a. Define an integer array of 5 elements and get user input to store in the array.
b. Loop through the array using the length If the number is positive, check for even or odd
numbers and print accordingly
c. If the number is negative, print negative. Else if the number is zero, print zero.
d. Finally compare the first and last element of the array and display if they equal, greater
or less*/
package Array.Level1;
import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is a positive even number.");
                } else {
                    System.out.println(number + " is a positive odd number.");
                }
            } else if (number < 0) {
                System.out.println(number + " is a negative number.");
            } else {
                System.out.println(number + " is zero.");
            }
        }

        if (numbers[0] == numbers[4]) {
            System.out.println("The first and last elements are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        scanner.close();
    }

}
