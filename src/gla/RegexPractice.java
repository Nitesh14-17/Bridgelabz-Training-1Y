import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

    static boolean validateUsername(String s) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return s.matches(regex);
    }

    static boolean validateLicensePlate(String s) {
        String regex = "^[A-Z]{2}\\d{4}$";
        return s.matches(regex);
    }

    static boolean validateHexColor(String s) {
        String regex = "^#([0-9A-Fa-f]{6})$";
        return s.matches(regex);
    }

    static List<String> extractEmails(String s) {
        List<String> emails = new ArrayList<>();
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            emails.add(m.group());
        }
        return emails;
    }

    static List<String> extractCapitalizedWords(String s) {
        List<String> words = new ArrayList<>();
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            words.add(m.group());
        }
        return words;
    }

    static List<String> extractDates(String s) {
        List<String> dates = new ArrayList<>();
        String regex = "\\d{2}/\\d{2}/\\d{4}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            dates.add(m.group());
        }
        return dates;
    }

    static List<String> extractLinks(String s) {
        List<String> links = new ArrayList<>();
        String regex = "https?://[^\\s]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            links.add(m.group());
        }
        return links;
    }

    static String replaceMultipleSpaces(String s) {
        return s.replaceAll("\\s+", " ");
    }

    static String censorBadWords(String s, List<String> badWords) {
        String result = s;
        for (String word : badWords) {
            result = result.replaceAll("(?i)\\b" + word + "\\b", "****");
        }
        return result;
    }

    static boolean validateIPAddress(String s) {
        String regex = "^((25[0-5]|2[0-4]\\d|[01]?\\d{1,2})\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d{1,2})$";
        return s.matches(regex);
    }

    static boolean validateCreditCard(String s) {
        String regex = "^[45]\\d{15}$";
        return s.matches(regex);
    }

    static List<String> extractProgrammingLanguages(String s) {
        List<String> langs = new ArrayList<>();
        String regex = "\\b(Java|Python|JavaScript|Go|C\\+\\+|C#|Ruby|PHP|Swift|Kotlin)\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            langs.add(m.group());
        }
        return langs;
    }

    static List<String> extractCurrencyValues(String s) {
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

    static List<String> findRepeatingWords(String s) {
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

    static boolean validateSSN(String s) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return s.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println("=== Problem 1: Validate Username ===");
        System.out.println("user_123: " + validateUsername("user_123"));
        System.out.println("123user: " + validateUsername("123user"));
        System.out.println("us: " + validateUsername("us"));

        System.out.println("\n=== Problem 2: Validate License Plate ===");
        System.out.println("AB1234: " + validateLicensePlate("AB1234"));
        System.out.println("A12345: " + validateLicensePlate("A12345"));

        System.out.println("\n=== Problem 3: Validate Hex Color ===");
        System.out.println("#FFA500: " + validateHexColor("#FFA500"));
        System.out.println("#ff4500: " + validateHexColor("#ff4500"));
        System.out.println("#123: " + validateHexColor("#123"));

        System.out.println("\n=== Problem 4: Extract Emails ===");
        String emailText = "Contact us at support@example.com and info@company.org";
        System.out.println("Text: " + emailText);
        System.out.println("Emails: " + extractEmails(emailText));

        System.out.println("\n=== Problem 5: Extract Capitalized Words ===");
        String capText = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        System.out.println("Text: " + capText);
        System.out.println("Words: " + extractCapitalizedWords(capText));

        System.out.println("\n=== Problem 6: Extract Dates ===");
        String dateText = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        System.out.println("Text: " + dateText);
        System.out.println("Dates: " + extractDates(dateText));

        System.out.println("\n=== Problem 7: Extract Links ===");
        String linkText = "Visit https://www.google.com and http://example.org for more info.";
        System.out.println("Text: " + linkText);
        System.out.println("Links: " + extractLinks(linkText));

        System.out.println("\n=== Problem 8: Replace Multiple Spaces ===");
        String spaceText = "This  is   an   example   with    multiple     spaces.";
        System.out.println("Input: " + spaceText);
        System.out.println("Output: " + replaceMultipleSpaces(spaceText));

        System.out.println("\n=== Problem 9: Censor Bad Words ===");
        String badText = "This is a damn bad example with some stupid words.";
        List<String> badWords = new ArrayList<>();
        badWords.add("damn");
        badWords.add("stupid");
        System.out.println("Input: " + badText);
        System.out.println("Output: " + censorBadWords(badText, badWords));

        System.out.println("\n=== Problem 10: Validate IP Address ===");
        System.out.println("192.168.1.1: " + validateIPAddress("192.168.1.1"));
        System.out.println("256.1.1.1: " + validateIPAddress("256.1.1.1"));
        System.out.println("10.0.0.1: " + validateIPAddress("10.0.0.1"));

        System.out.println("\n=== Problem 11: Validate Credit Card ===");
        System.out.println("4111111111111111: " + validateCreditCard("4111111111111111"));
        System.out.println("5111111111111111: " + validateCreditCard("5111111111111111"));
        System.out.println("3111111111111111: " + validateCreditCard("3111111111111111"));

        System.out.println("\n=== Problem 12: Extract Programming Languages ===");
        String langText = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        System.out.println("Text: " + langText);
        System.out.println("Languages: " + extractProgrammingLanguages(langText));

        System.out.println("\n=== Problem 13: Extract Currency Values ===");
        String currencyText = "The price is $45.99, and the discount is 10.50.";
        System.out.println("Text: " + currencyText);
        System.out.println("Values: " + extractCurrencyValues(currencyText));

        System.out.println("\n=== Problem 14: Find Repeating Words ===");
        String repeatText = "This is is a repeated repeated word test.";
        System.out.println("Text: " + repeatText);
        System.out.println("Repeating: " + findRepeatingWords(repeatText));

        System.out.println("\n=== Problem 15: Validate SSN ===");
        System.out.println("123-45-6789: " + validateSSN("123-45-6789"));
        System.out.println("123456789: " + validateSSN("123456789"));
    }
}
