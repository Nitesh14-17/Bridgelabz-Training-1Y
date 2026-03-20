public class NTCD {
    public static void main(String[] a) {
        int[] x = {10, 20, 30};
        java.util.Scanner s = new java.util.Scanner(System.in);
        int i = s.nextInt();
        int d = s.nextInt();
        try {
            int v = 0;
            try {
                v = x[i];
                System.out.println(v / d);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}