import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {

    static List<String> extract(String s) {
        List<String> dates = new ArrayList<>();
        String regex = "\\d{2}/\\d{2}/\\d{4}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            dates.add(m.group());
        }
        return dates;
    }

    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        System.out.println("Text: " + text);
        System.out.println("Dates: " + extract(text));

        String text2 = "Meetings on 01/01/2025, 14/03/2025, 31/12/2024";
        System.out.println("\nText: " + text2);
        System.out.println("Dates: " + extract(text2));
    }
}
