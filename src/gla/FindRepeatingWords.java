import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {

    static List<String> findRepeating(String s) {
        List<String> repeated = new ArrayList<>();
        String regex = "\\b(\\w+)\\s+(?=.*\\b\\1\\b)";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);
        Set<String> found = new HashSet<>();
        while (m.find()) {
            found.add(m.group(1));
        }
        repeated.addAll(found);
        return repeated;
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        System.out.println("Text: " + text);
        System.out.println("Repeating Words: " + findRepeating(text));

        String text2 = "Hello hello world world test testing.";
        System.out.println("\nText: " + text2);
        System.out.println("Repeating Words: " + findRepeating(text2));
    }
}
