import java.util.Scanner;

public class WindChillTemperature {
    
    public double calc(double t, double s) {
        return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(s, 0.16);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WindChillTemperature w = new WindChillTemperature();
        
        System.out.print("Enter temperature (in Fahrenheit): ");
        double t = sc.nextDouble();
        
        System.out.print("Enter wind speed (in mph): ");
        double s = sc.nextDouble();
        
        double wc = w.calc(t, s);
        
        System.out.println("Wind Chill Temperature: " + wc + " F");
        
        sc.close();
    }
}
