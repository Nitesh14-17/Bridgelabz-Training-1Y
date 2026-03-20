public class FBD {
    public static void main(String[] x) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Operation completed");
        }
    }
}