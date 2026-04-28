public class ValidateIPAddress {

    static boolean validate(String s) {
        String regex = "^((25[0-5]|2[0-4]\\d|[01]?\\d{1,2})\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d{1,2})$";
        return s.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println("192.168.1.1: " + validate("192.168.1.1"));
        System.out.println("256.1.1.1: " + validate("256.1.1.1"));
        System.out.println("10.0.0.1: " + validate("10.0.0.1"));
        System.out.println("255.255.255.255: " + validate("255.255.255.255"));
        System.out.println("0.0.0.0: " + validate("0.0.0.0"));
        System.out.println("192.168.1: " + validate("192.168.1"));
    }
}
