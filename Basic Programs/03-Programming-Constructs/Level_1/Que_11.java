/* Rewrite the program 10 to find the sum until the user enters 0 or a negative number using
while loop and break statement
Hint =>
a. Use infinite while loop as in while (true)
b. Take the user entry and check if the user entered 0 or a negative number to break the
loop using break;*/
import java.util.Scanner;
public class Que_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double userInput;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            userInput = scanner.nextDouble();

            if (userInput <= 0) {
                break;
            }

            total += userInput;
        }

        System.out.println("The total sum is: " + total);
        scanner.close();
    }
}
