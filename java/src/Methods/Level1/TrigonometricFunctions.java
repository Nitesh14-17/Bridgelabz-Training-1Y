import java.util.Scanner;

public class TrigonometricFunctions {
    
    public double[] calc(double ang) {
        double rad = Math.toRadians(ang);
        
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        
        return new double[] {sin, cos, tan};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrigonometricFunctions t = new TrigonometricFunctions();
        
        System.out.print("Enter angle in degrees: ");
        double ang = sc.nextDouble();
        
        double[] res = t.calc(ang);
        
        System.out.println("Angle: " + ang + " degrees");
        System.out.println("Sine: " + res[0]);
        System.out.println("Cosine: " + res[1]);
        System.out.println("Tangent: " + res[2]);
        
        sc.close();
    }
}
