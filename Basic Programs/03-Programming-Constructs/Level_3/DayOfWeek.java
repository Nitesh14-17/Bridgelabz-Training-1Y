/*Write a program DayOfWeek that takes a date as input and prints the day of the week
that the date falls on. Your program should take three command-line arguments: m
(month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For
output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following
formulas, for the Gregorian calendar (where / denotes integer division):

yo = y - (14 - m) / 12

x=yo + yo/4 - yo/100 + yo/400

mo = m + 12 x ((14 - m) / 12) - 2

do = (d + x + 31mo / 12) mod 7 */
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int d = scanner.nextInt();
        System.out.print("Enter year (e.g., 2024): ");
        int y = scanner.nextInt();
        
        int yo = y - (14 - m) / 12;
        int x = yo + yo / 4 - yo / 100 + yo / 400;
        int mo = m + 12 * ((14 - m) / 12) - 2;
        int dofWeek = (d + x + (31 * mo) / 12) % 7;
        
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        System.out.println("The day of the week is: " + days[dofWeek]);
        
        scanner.close();
    }
}
