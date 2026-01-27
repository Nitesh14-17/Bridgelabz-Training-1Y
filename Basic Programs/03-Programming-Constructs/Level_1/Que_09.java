/*Write a program to count down the number from the user input value to 1 using a for loop
for a rocket launch
Hint =>
a. Create a variable counter to take user inputted value for the countdown.
b. Use the for loop to check if the counter is 1
c. Inside a for loop, print the value of the counter and decrement the counter. */
import java.util.Scanner;
public class Que_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to start countdown: ");
        int counter = scanner.nextInt();
        
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        
        System.out.println("Rocket Launched!");
        scanner.close();
    }
}
