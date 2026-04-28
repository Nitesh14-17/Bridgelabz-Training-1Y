import java.util.ArrayList;
import java.util.List;

public class CensorBadWords {

    static String censor(String s, List<String> badWords) {
        String result = s;
        for (String word : badWords) {
            result = result.replaceAll("(?i)\\b" + word + "\\b", "****");
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        List<String> badWords = new ArrayList<>();
        badWords.add("damn");
        badWords.add("stupid");
        System.out.println("Input: " + text);
        System.out.println("Output: " + censor(text, badWords));

        String text2 = "This bad language is not good and very rude.";
        List<String> badWords2 = new ArrayList<>();
        badWords2.add("bad");
        badWords2.add("rude");
        System.out.println("\nInput: " + text2);
        System.out.println("Output: " + censor(text2, badWords2));
    }
}
