public class ValidateLicensePlate {

    static boolean validate(String s) {
        String regex = "^[A-Z]{2}\\d{4}$";
        return s.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println("AB1234: " + validate("AB1234"));
        System.out.println("A12345: " + validate("A12345"));
        System.out.println("XY9999: " + validate("XY9999"));
        System.out.println("ab1234: " + validate("ab1234"));
    }
}
