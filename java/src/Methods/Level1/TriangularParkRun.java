import java.util.Scanner;

public class TriangularParkRun {
    
    public static int calculate(double a, double b, double c) {
        double p = a + b + c;
        double d = 5000;
        return (int) (d / p);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter side 1 (in meters): ");
        double a = sc.nextDouble();
        
        System.out.print("Enter side 2 (in meters): ");
        double b = sc.nextDouble();
        
        System.out.print("Enter side 3 (in meters): ");
        double c = sc.nextDouble();
        
        int r = calculate(a, b, c);
        
        System.out.println("The athlete must complete " + r + " rounds to complete a 5 km run");
        
        sc.close();
    }
}
