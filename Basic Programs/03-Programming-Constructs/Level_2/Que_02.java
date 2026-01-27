/*Create a program to find the bonuses of employees based on their years of service.
Hint =>
a. Zara decided to give a bonus of 5% to employees whose year of service is more than 5
years.
b. Take salary and year of service in the year as input.
c. Print the bonus amount. */
import java.util.Scanner;
public class Que_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();
        
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Your bonus amount is: " + bonus);
        } else {
            System.out.println("You are not eligible for a bonus.");
        }
        
        scanner.close();
    }
}
