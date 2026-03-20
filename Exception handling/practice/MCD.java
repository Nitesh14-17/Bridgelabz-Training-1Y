public class MCD {
    public static void main(String[] a) {
        int[] x = {1, 2, 3};
        java.util.Scanner s = new java.util.Scanner(System.in);
        int i = s.nextInt();
        try {
            System.out.println("Value at index " + i + ": " + x[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}