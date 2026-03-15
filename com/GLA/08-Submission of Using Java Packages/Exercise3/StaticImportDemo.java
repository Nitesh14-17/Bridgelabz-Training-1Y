import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        System.out.println("===== Exercise 3 =====\n");

        double n1 = 16.0;
        double n2 = 25.0;
        double n3 = -45.0;

        System.out.println("sqrt(16) = " + sqrt(n1));
        System.out.println("sqrt(25) = " + sqrt(n2));
        
        System.out.println("pow(2, 8) = " + pow(2.0, 8.0));
        System.out.println("pow(3, 4) = " + pow(3.0, 4.0));
        
        System.out.println("max(16, 25) = " + max(16, 25));
        System.out.println("max(100, 250) = " + max(100, 250));
        
        System.out.println("min(16, 25) = " + min(16, 25));
        System.out.println("min(50, 30) = " + min(50, 30));
        
        System.out.println("abs(-45) = " + abs(n3));
        System.out.println("abs(-78.5) = " + abs(-78.5));
        
        System.out.println("ceil(5.2) = " + ceil(5.2));
        System.out.println("floor(5.8) = " + floor(5.8));
        
        System.out.println("\nNote: Static import lets us use sqrt, pow, etc directly");
    }
}
