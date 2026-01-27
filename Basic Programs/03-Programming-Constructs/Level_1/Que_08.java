/*Write a program to count down the number from the user input value to 1 using a while loop
for a rocket launch
Hint =>
a. Create a variable counter to take user inputted value for the countdown.
b. Use the while loop to check if the counter is 1
c. Inside a while loop, print the value of the counter and decrement the counter. */
import java.util.Scanner;
public class Que_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to start countdown: ");
        int counter = scanner.nextInt();
        
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        
        System.out.println("Rocket Launched!");
        scanner.close();
    }
}
