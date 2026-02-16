public class CalendarDisplay {
    
    static String getMonthName(int month) {
        String[] months = {"", "January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        return months[month];
    }
    
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    static int getDaysInMonth(int month, int year) {
        int[] daysArray = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysArray[month];
    }
    
    static int getFirstDay(int month, int year) {
        int totalDays = 0;
        for (int y = 1; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }
        for (int m = 1; m < month; m++) {
            totalDays += getDaysInMonth(m, year);
        }
        return totalDays % 7;
    }
    
    static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDay(month, year);
        
        System.out.println("\n    " + monthName + " " + year);
        System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }
        
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d  ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int month = 7;
        int year = 2005;
        displayCalendar(month, year);
    }
}
