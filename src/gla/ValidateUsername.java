public class ValidateUsername {

    static boolean validate(String s) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return s.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println("user_123: " + validate("user_123"));
        System.out.println("123user: " + validate("123user"));
        System.out.println("us: " + validate("us"));
        System.out.println("validUser99: " + validate("validUser99"));
        System.out.println("a: " + validate("a"));
    }
}
