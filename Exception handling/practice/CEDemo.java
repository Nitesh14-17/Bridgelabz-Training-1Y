class IAE extends Exception {}
public class CEDemo {
    static void v(int a) throws IAE {
        if (a < 18) throw new IAE();
    }
    public static void main(String[] a) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int x = s.nextInt();
        try {
            v(x);
            System.out.println("Access granted!");
        } catch (IAE e) {
            System.out.println("Age must be 18 or above");
        }
    }
}