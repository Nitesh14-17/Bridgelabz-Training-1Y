public class TVTD {
    static double c(double a, double r, int y) throws IllegalArgumentException {
        if (a < 0 || r < 0) throw new IllegalArgumentException();
        return a * r * y / 100;
    }
    public static void main(String[] x) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        double a = s.nextDouble();
        double r = s.nextDouble();
        int y = s.nextInt();
        try {
            double i = c(a, r, y);
            System.out.println(i);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}