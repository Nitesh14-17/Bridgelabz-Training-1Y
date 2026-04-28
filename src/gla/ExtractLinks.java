import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {

    static List<String> extract(String s) {
        List<String> links = new ArrayList<>();
        String regex = "https?://[^\\s]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            links.add(m.group());
        }
        return links;
    }

    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        System.out.println("Text: " + text);
        System.out.println("Links: " + extract(text));

        String text2 = "Check https://github.com and http://stackoverflow.com today.";
        System.out.println("\nText: " + text2);
        System.out.println("Links: " + extract(text2));
    }
}
