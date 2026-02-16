import java.util.Scanner;

public class QuadraticEquation {
    
    public static double[] findRoots(double a, double b, double c) {
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be 0)");
            return new double[0];
        }
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if (delta > 0) {
            double sqrtDelta = Math.sqrt(delta);
            double r1 = (-b + sqrtDelta) / (2 * a);
            double r2 = (-b - sqrtDelta) / (2 * a);
            return new double[]{r1, r2};
        } else if (delta == 0) {
            double r = -b / (2 * a);
            return new double[]{r};
        } else {
            return new double[0];
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=== Quadratic Equation Solver ===");
        System.out.println("Solve ax^2 + bx + c = 0\n");
        
        System.out.print("Enter coefficient a: ");
        double a = scan.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scan.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = scan.nextDouble();
        
        double[] roots = findRoots(a, b, c);
        
        System.out.println("\n=== Results ===");
        System.out.println("Equation: " + a + "x^2 + " + b + "x + " + c + " = 0");
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Discriminant (delta): " + delta);
        
        if (roots.length == 2) {
            System.out.println("Two roots found:");
            System.out.println("Root 1 (x1) = " + roots[0]);
            System.out.println("Root 2 (x2) = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One root found:");
            System.out.println("Root (x) = " + roots[0]);
        } else {
            System.out.println("No real roots found (delta is negative)");
        }
        
        scan.close();
    }
}
