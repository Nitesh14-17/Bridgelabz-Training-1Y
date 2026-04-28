import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {

    static List<String> extract(String s) {
        List<String> emails = new ArrayList<>();
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            emails.add(m.group());
        }
        return emails;
    }

    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
        System.out.println("Text: " + text);
        System.out.println("Emails: " + extract(text));

        String text2 = "Email me at john.doe@gmail.com or jane_smith@yahoo.org please";
        System.out.println("\nText: " + text2);
        System.out.println("Emails: " + extract(text2));
    }
}
