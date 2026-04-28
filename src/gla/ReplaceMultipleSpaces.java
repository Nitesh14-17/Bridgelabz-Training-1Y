public class ReplaceMultipleSpaces {

    static String replace(String s) {
        return s.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String text = "This  is   an   example   with    multiple     spaces.";
        System.out.println("Input: " + text);
        System.out.println("Output: " + replace(text));

        String text2 = "Hello     world    this   is    a   test";
        System.out.println("\nInput: " + text2);
        System.out.println("Output: " + replace(text2));
    }
}
