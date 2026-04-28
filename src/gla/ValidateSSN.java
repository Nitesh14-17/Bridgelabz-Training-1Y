public class ValidateSSN {

    static boolean validate(String s) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return s.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println("123-45-6789: " + validate("123-45-6789"));
        System.out.println("123456789: " + validate("123456789"));
        System.out.println("000-00-0000: " + validate("000-00-0000"));
        System.out.println("999-99-9999: " + validate("999-99-9999"));
        System.out.println("12-34-56: " + validate("12-34-56"));
    }
}
