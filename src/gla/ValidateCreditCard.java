public class ValidateCreditCard {

    static boolean validate(String s) {
        String regex = "^[45]\\d{15}$";
        return s.matches(regex);
    }

    static String getCardType(String s) {
        if (!s.matches("^\\d{16}$")) return "Invalid length";
        if (s.startsWith("4")) return "Visa";
        if (s.startsWith("5")) return "MasterCard";
        return "Invalid card type";
    }

    public static void main(String[] args) {
        System.out.println("4111111111111111: " + validate("4111111111111111") + " - " + getCardType("4111111111111111"));
        System.out.println("5111111111111111: " + validate("5111111111111111") + " - " + getCardType("5111111111111111"));
        System.out.println("3111111111111111: " + validate("3111111111111111") + " - " + getCardType("3111111111111111"));
        System.out.println("4999999999999999: " + validate("4999999999999999") + " - " + getCardType("4999999999999999"));
    }
}
