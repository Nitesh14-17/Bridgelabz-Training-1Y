public class SafeInt {
    public static int safeParseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return -1;
        }
    }
    public static void main(String[] args) {
        String[] arr = {"123", "abc", "45.6", "0"};
        for (String s : arr) System.out.println(safeParseInt(s));
    }
}
