/*1. Problem 1: Time Zones and ZonedDateTime Write a program that displays the current
time in different time zones:
➢ GMT (Greenwich Mean Time)
➢ IST (Indian Standard Time)
➢ PST (Pacific Standard Time)
Hint: Use ZonedDateTime and ZoneId to work with different time zones. */
package String.Extra;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
public class Time_zone {
    public static void main(String[] args) {

        String[] timeZones = {"GMT", "IST", "PST"};


        for (String tz : timeZones) {
            ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(tz));
            String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z"));
            System.out.println("Current time in " + tz + ": " + formattedTime);
        }
    }
}
