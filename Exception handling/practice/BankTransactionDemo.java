class IBE extends Exception {}
class B {
    double b;
    B(double x) { b = x; }
    void w(double a) throws IBE {
        if (a < 0) throw new IllegalArgumentException();
        if (a > b) throw new IBE();
        b -= a;
        System.out.println("Withdrawal successful, new balance: " + b);
    }
}
public class BankTransactionDemo {
    public static void main(String[] args) {
        B c = new B(1000);
        java.util.Scanner s = new java.util.Scanner(System.in);
        double a = s.nextDouble();
        try {
            c.w(a);
        } catch (IBE e) {
            System.out.println("Insufficient balance!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
        s.close();
    }
}