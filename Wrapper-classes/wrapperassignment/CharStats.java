import java.util.Scanner;

public class CharStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int letters = 0, digits = 0, specials = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) letters++;
            else if (Character.isDigit(c)) digits++;
            else if (!Character.isWhitespace(c)) specials++;
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specials);
    }
}
