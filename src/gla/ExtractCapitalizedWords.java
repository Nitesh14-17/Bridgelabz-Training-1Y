import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWords {

    static List<String> extract(String s) {
        List<String> words = new ArrayList<>();
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            words.add(m.group());
        }
        return words;
    }

    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        System.out.println("Text: " + text);
        System.out.println("Capitalized Words: " + extract(text));

        String text2 = "John and Sarah went to London to visit the British Museum.";
        System.out.println("\nText: " + text2);
        System.out.println("Capitalized Words: " + extract(text2));
    }
}
