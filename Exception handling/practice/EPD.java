public class EPD {
    static void m1() {
        int x = 10 / 0;
    }
    static void m2() {
        m1();
    }
    public static void main(String[] a) {
        try {
            m2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}