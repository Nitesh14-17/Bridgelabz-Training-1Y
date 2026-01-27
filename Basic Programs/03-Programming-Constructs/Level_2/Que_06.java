/* Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on
their ages and the tallest among the friends based on their heights
Hint =>
a. Take user input for the age and height of the 3 friends and store it in a variable
b. Find the smallest of the 3 ages to find the youngest friend and display it
c. Find the largest of the 3 heights to find the tallest friend and display it*/
import java.util.Scanner;
public class Que_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();
        
        
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = scanner.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = scanner.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = scanner.nextDouble();
        
        
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend;
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        
        
        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend;
        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }
        
        
        System.out.println("The youngest friend is: " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " cm");
        
        scanner.close();
    }
}