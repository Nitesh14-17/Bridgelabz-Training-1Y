import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues {

    static List<String> extract(String s) {
        List<String> values = new ArrayList<>();
        String regex = "\\$?\\d+\\.?\\d*";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            String val = m.group();
            if (val.contains(".") || val.startsWith("$")) {
                values.add(val);
            }
        }
        return values;
    }

    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        System.out.println("Text: " + text);
        System.out.println("Values: " + extract(text));

        String text2 = "Items cost $99.99, $5.50, and $1200.99";
        System.out.println("\nText: " + text2);
        System.out.println("Values: " + extract(text2));
    }
}
