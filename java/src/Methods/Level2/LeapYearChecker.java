import java.util.Scanner;

public class LeapYearChecker {
    
    public static boolean isLeapYear(int yr) {
        if (yr < 1582) {
            return false;
        }
        
        if (yr % 400 == 0) {
            return true;
        }
        if (yr % 100 == 0) {
            return false;
        }
        if (yr % 4 == 0) {
            return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int yr = scan.nextInt();
        
        if (yr < 1582) {
            System.out.println("Error: The program only works for years >= 1582 (Gregorian calendar)");
        } else if (isLeapYear(yr)) {
            System.out.println(yr + " is a Leap Year");
        } else {
            System.out.println(yr + " is NOT a Leap Year");
        }
        
        scan.close();
    }
}
