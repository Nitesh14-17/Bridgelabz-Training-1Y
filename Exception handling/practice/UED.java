import java.util.*;
public class UED {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        try {
            int x = s.nextInt();
            int y = s.nextInt();
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}