/*1. Create a program to find the bonus of 10 employees based on their years of service and the
total bonus amount the company Zara has to pay, along with the old and new salary.
Hint =>
a. Zara decides to give a bonus of 5% to employees whose year of service is more than 5
years or 2% if less than 5 years
b. Define a double array to save salary and years of service for each of the 10 employees
c. Also define a double array to save the new salary and the bonus amount as well as
variables to save the total bonus, total old salary, and new salary
d. Define a loop to take input from the user. If salary or year of service is an invalid number
then ask the use to enter again. Note in this case you will have to decrement the index
counter
e. Define another loop to calculate the bonus of 10 employees based on their years of
service. Save the bonus in the array, compute the new salary, and save in the array.
Also, the total bonus and total old and new salary can be calculated in the loop
f. Print the total bonus payout as well as the total old and new salary of all the employees*/
package Array.Level2;
import java.util.Scanner;

public class Que_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] employeeData = new double[10][2];
        double[] bonusData = new double[10];
        double[] newSalaryData = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;


        for (int i = 0; i < employeeData.length; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1) + ":");
            System.out.print("Salary: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid salary.");
                scanner.next();
                System.out.print("Salary: ");
            }
            employeeData[i][0] = scanner.nextDouble();

            System.out.print("Years of Service: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number of years.");
                scanner.next();
                System.out.print("Years of Service: ");
            }
            employeeData[i][1] = scanner.nextDouble();
        }

        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;

            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            bonusData[i] = bonus;
            newSalaryData[i] = salary + bonus;
            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalaryData[i];
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}

