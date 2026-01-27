/* Create a program to find the multiplication table of a number entered by the user from 6 to 9.
Hint =>
a. Take integer input and store it in the variable number
b. Using a for loop, find the multiplication table of number from 6 to 9 and print it in the
format number * i = ___*/
import java.util.Scanner;
public class Que_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to find its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();
        
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
        
        scanner.close();
    }
}
