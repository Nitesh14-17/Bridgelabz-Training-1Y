public class ValidateHexColor {

    static boolean validate(String s) {
        String regex = "^#([0-9A-Fa-f]{6})$";
        return s.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println("#FFA500: " + validate("#FFA500"));
        System.out.println("#ff4500: " + validate("#ff4500"));
        System.out.println("#123: " + validate("#123"));
        System.out.println("#FFFFFF: " + validate("#FFFFFF"));
        System.out.println("#000000: " + validate("#000000"));
    }
}
