import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguages {

    static List<String> extract(String s) {
        List<String> langs = new ArrayList<>();
        String regex = "\\b(Java|Python|JavaScript|Go|C\\+\\+|C#|Ruby|PHP|Swift|Kotlin)\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            langs.add(m.group());
        }
        return langs;
    }

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        System.out.println("Text: " + text);
        System.out.println("Languages: " + extract(text));

        String text2 = "I know C++, C#, Ruby, PHP, Swift and Kotlin.";
        System.out.println("\nText: " + text2);
        System.out.println("Languages: " + extract(text2));
    }
}
