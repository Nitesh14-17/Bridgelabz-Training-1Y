/*Problem 2: Date Arithmetic Create a program that:
➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
➢ Then subtracts 3 weeks from the result.
Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and
minusWeeks() methods. */
package String.Extra;
import java.time.LocalDate;
import java.util.Scanner;

public class Date_Arithmetic {
    public static void main(String[] args)
    { Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String inputDate = scanner.nextLine();
        try { LocalDate date = LocalDate.parse(inputDate);
            LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
            System.out.println("Modified Date: " + modifiedDate);
        }
        catch (Exception e) { System.out.println("Invalid date format. Please enter in YYYY-MM-DD format.");

        }
        finally { scanner.close();

        }
    }

}
