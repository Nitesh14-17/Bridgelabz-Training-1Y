/*Rewrite program 1 to determine Leap Year with single if condition using logical and && and
or || operators */
import java.util.Scanner;
public class Que_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
        
        scanner.close();
    }
}
